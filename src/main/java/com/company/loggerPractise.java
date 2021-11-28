//package com.company;
//
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//
//
//public class loggerPractise{
//    public static final Logger mnLogger = LogManager.getLogger("com.modeln.intg.client");
//
//    private loggerPractise() {
//    }
//
//    /**
//     * Trace entry. Log level is debug.
//     */
//    public static void traceEntry() {
//        if (mnLogger.isDebugEnabled()) {
//            //
//            // Use index = 2 here and believe number of stack trace elements is bigger than 3.
//            // The reason not to check number of stack trace elements is to consider performance.
//            //
//            StackTraceElement ste = Thread.currentThread().getStackTrace()[2];
//            mnLogger.atDebug().log(ste.getClassName() + "." + ste.getMethodName() + "() - entry");
//        }
//    }
//
//    public static void traceEntry(String params) {
//        if (mnLogger.isDebugEnabled()) {
//            StackTraceElement ste = Thread.currentThread().getStackTrace()[2];
//            mnLogger.atDebug().log(ste.getClassName() + "." + ste.getMethodName() + "() - entry parms (" + params + ")");
//        }
//    }
//
//    /**
//     * Trace exit. Log level is debug.
//     */
//    public static void traceExit() {
//        if (mnLogger.isDebugEnabled()) {
//            StackTraceElement ste = Thread.currentThread().getStackTrace()[2];
//            mnLogger.atDebug().log(ste.getClassName() + "." + ste.getMethodName() + "() - exit");
//        }
//    }
//
//    public static void traceExit(String results) {
//        if (mnLogger.isDebugEnabled()) {
//            StackTraceElement ste = Thread.currentThread().getStackTrace()[2];
//            mnLogger.atDebug().log(ste.getClassName() + "." + ste.getMethodName() + "() - exit with (" + results + ")");
//        }
//    }
//
//    /**
//     * Log debug information.
//     * @param message
//     */
//    public static void debug(String message) {
//        mnLogger.atDebug().log(message);
//    }
//
//    /**
//     * Log information. Log level is info
//     * @param message
//     */
//    public static void info(String message) {
//        mnLogger.atInfo().log(message);
//    }
//
//    /**
//     * Log error information
//     * @param message
//     */
//    public static void error(String message) {
//        mnLogger.atError().log(message);
//    }
//
//    /**
//     * Log exception throwing and throw exception.
//     * @param ex
//     * @throws Exception
//     */
//    public static void throwing(Exception ex) throws Exception {
//        StackTraceElement ste = Thread.currentThread().getStackTrace()[2];
//        mnLogger.atError().log(ste.getClassName() + "." + ste.getMethodName() + "() - Throwing exception (" + ex.getMessage() + ")");
//        throw(ex);
//    }
//
//    /**
//     * Catch exception and print stack trace.
//     * @param ex
//     */
//    public static void catching(Exception ex) {
//        mnLogger.catching(ex);
//    }
//}
//
