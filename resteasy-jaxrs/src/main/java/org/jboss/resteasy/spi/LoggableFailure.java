package org.jboss.resteasy.spi;

/**
 * This exception should only be used by Resteasy integrators.  Applications code should use WebApplicationException
 * <p/>
 * This is thrown by Restasy runtime when a failure occurs.  It will be logged by the runtime
 *
 * @author <a href="mailto:bill@burkecentral.com">Bill Burke</a>
 * @version $Revision: 1 $
 */
public class LoggableFailure extends Failure
{
   public LoggableFailure(String s, Throwable throwable)
   {
      super(s, throwable);
      loggable = true;
   }

   public LoggableFailure(Throwable throwable)
   {
      super(throwable);
      loggable = true;
   }

   public LoggableFailure(String s)
   {
      super(s);
      loggable = true;
   }

   public LoggableFailure(int errorCode)
   {
      super(errorCode);
      loggable = true;
   }

   public LoggableFailure(String s, int errorCode)
   {
      super(s, errorCode);
      loggable = true;
   }

   public LoggableFailure(String s, Throwable throwable, int errorCode)
   {
      super(s, throwable, errorCode);
      loggable = true;
   }

   public LoggableFailure(Throwable throwable, int errorCode)
   {
      super(throwable, errorCode);
      loggable = true;
   }
}
