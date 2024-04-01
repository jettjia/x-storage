/*    */ package org.apache.chemistry.opencmis.commons.impl.jaxb;
/*    */ 
/*    */ import javax.xml.ws.WebFault;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @WebFault(name = "cmisFault", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
/*    */ public class CmisException
/*    */   extends Exception
/*    */ {
/*    */   private CmisFaultType cmisFault;
/*    */   
/*    */   public CmisException() {}
/*    */   
/*    */   public CmisException(String message) {
/* 23 */     super(message);
/*    */   }
/*    */   
/*    */   public CmisException(String message, Throwable cause) {
/* 27 */     super(message, cause);
/*    */   }
/*    */   
/*    */   public CmisException(String message, CmisFaultType cmisFault) {
/* 31 */     super(message);
/* 32 */     this.cmisFault = cmisFault;
/*    */   }
/*    */   
/*    */   public CmisException(String message, CmisFaultType cmisFault, Throwable cause) {
/* 36 */     super(message, cause);
/* 37 */     this.cmisFault = cmisFault;
/*    */   }
/*    */   
/*    */   public CmisFaultType getFaultInfo() {
/* 41 */     return this.cmisFault;
/*    */   }
/*    */ }


/* Location:              E:\web\java_work\jd-gui-windows-1.6.6\chemistry-opencmis-commons-impl-1.1.0.jar!\org\apache\chemistry\opencmis\commons\impl\jaxb\CmisException.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */