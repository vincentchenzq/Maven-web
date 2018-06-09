package com.vincent.common;

import org.apache.log4j.Logger;

public class LoggerUtils {
    /**
     * 日志记录器
     */

    private static Logger logger = Logger.getLogger(LoggerUtils.class);

    private LoggerUtils() {

    }

    /**
     * 跟踪日志：记录用户使用某个系统功能的完整流程，便于开发人员查看代码的执行调用过程
     *
     * @param message
     */
    public static void trace(String message) {
        logger.trace(getClassMethodInfo() + message);
    }

    /**
     * 审计日志：保存用户业务行为相关的信息，主要是用来保留用户和业务的相关的记录
     */
    public static void info(String message) {
        logger.info(getClassMethodInfo() + message);
    }

    /**
     * 错误日志：记录系统程序异常信息，并且打印异常堆栈
     *
     * @param t
     */
    public static void error(String message, Throwable e) {
        logger.error(getClassMethodInfo() + message, e);
    }

    // /**
    // * 错误日志：记录系统程序异常信息，不打印异常堆栈
    // *
    // * @author CAOGUANGYUAN984
    // * @param message
    // */
    // private static void error(String message) {
    // logSupport.error(getClassMethodInfo() + message);
    // }

    /**
     * 获取调用的类名和方法名
     *
     * @return
     */
    public static String getClassMethodInfo() {
        StringBuilder sb = new StringBuilder();
        Exception e = new Exception();
        String methodName = e.getStackTrace()[2].getMethodName();// 获得调用者的方法名
        String className = e.getStackTrace()[2].getClassName();
        return sb.append(className.substring(className.lastIndexOf(".") + 1)).append(".").append(methodName).append(":")
                .toString();
    }

}
