package com.example.springbootmybatis.Interceptor;


import org.apache.commons.collections.MapUtils;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.SqlCommandType;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.factory.DefaultObjectFactory;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.util.Map;
import java.util.Properties;

/**
 * mybatis 拦截器
 */

@Intercepts(  //注意这个签名是可以直接配置多个的哦！！
        @Signature(
                type = Executor.class,  //签名类型:Executor
                method = "query",  //这个类型对应的方法
                args = {MappedStatement.class, Object.class, RowBounds.class, ResultHandler.class}  //参数
        )
)
@Component
public class MybatisInterceptor implements Interceptor {

    private String DBTYPE = null;

    @Override //拦截业务: 你要做的事情
    public Object intercept(Invocation invocation) throws Throwable {
        System.err.println("hello...................");
        System.err.println("DBTYPE:" + DBTYPE);
        Object[] target = invocation.getArgs();
        MappedStatement mappedStatement = (MappedStatement) target[0];
        SqlCommandType sqlCommandType = mappedStatement.getSqlCommandType();
        System.err.println("sqlCommandType:="+sqlCommandType);
        Object parameter = invocation.getArgs()[1];//获取参数
        String sqlId = mappedStatement.getId();//获取sql语句的id
        System.err.println("sqlId:="+sqlId);
        BoundSql boundSql = mappedStatement.getBoundSql(parameter);//BoundSql封装myBatis最终产生的sql类
        String sql = boundSql.getSql();
        System.err.println("sql:="+sql);
        if(sql.contains("t_student")){
            System.err.println("t_student======t_student！！！");
            if(SqlCommandType.INSERT.equals(sqlCommandType)){
                System.err.println("INSERT======INSERT！！！SELECT");
            }else if(SqlCommandType.SELECT.equals(sqlCommandType)){
                System.err.println("SELECT======SELECT！！！SELECT");
                //获取到原始参数
                Object parameterObject = boundSql.getParameterObject();
                Map<String,Object> map = (Map<String,Object>)parameterObject;
                //获取到原始sql语句
//                String sql_old = boundSql.getSql();
//                String sql_new = sql_old + " limit 100" ;
//                Field field = boundSql.getClass().getDeclaredField("sql");
//                field.setAccessible(true);
//                field.set(boundSql,sql_new);
                /**
                Object parameterObject = boundSql.getParameterObject();
                System.err.println("parameterObject:="+parameterObject);
                System.err.println("==========map=======转=========json=========");
                Map<String,Object> map = (Map<String,Object>)parameterObject;

                System.err.println("map==="+map.toString());
                JSON json = JSONUtil.parse(parameter);
                System.err.println("json==="+json.toString());
                 **/
            }
        }
        return invocation.proceed();
        /***********学习***********/
//        Object Target = invocation.getTarget();//获取当期啊被拦截的对象
//        if(Target instanceof Executor){
//            Object[] args =  invocation.getArgs();//方法中的参数
//            //获取原始的ms
//            MappedStatement ms = (MappedStatement)args[0];
//            String id = ms.getId();
//            System.err.println("id:" + id);
//            String commandName = ms.getSqlCommandType().name();
//            System.err.println("commandName:" + commandName);
//            Object parameterObject = args[1];
//            BoundSql boundSql = ms.getBoundSql(parameterObject);
//            String sql = boundSql.getSql();
//            System.err.println("sql:" + sql);
//            System.err.println("methodName:="+invocation.getMethod().getName());//被拦截的方法
//        }
//        invocation.getArgs();//方法中的参数
//        invocation.getClass();
        //做业务:  【注意：一定要放行】
        /***********学习***********/ //通过反射调用运行时方法
//        Object proceed = invocation.proceed();//proceed：实际上执行了method.invoke(target,args);

    }

    @Override //匹配你的拦截规则:
    public Object plugin(Object target) {
        //做拦截处理:默认都是这一句
        return Plugin.wrap(target, this);
        //不做拦截: return target;
    }

    @Override //通过这个方法获取到你自定义的配置--没有配置 就不需要了
    public void setProperties(Properties properties) {

    }
}
