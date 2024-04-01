/*    */ package org.apache.chemistry.opencmis.commons.impl.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlEnumValue;
/*    */ import javax.xml.bind.annotation.XmlType;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @XmlType(name = "enumServiceException")
/*    */ @XmlEnum
/*    */ public enum EnumServiceException
/*    */ {
/* 39 */   CONSTRAINT("constraint"),
/*    */   
/* 41 */   NAME_CONSTRAINT_VIOLATION("nameConstraintViolation"),
/*    */   
/* 43 */   CONTENT_ALREADY_EXISTS("contentAlreadyExists"),
/*    */   
/* 45 */   FILTER_NOT_VALID("filterNotValid"),
/*    */   
/* 47 */   INVALID_ARGUMENT("invalidArgument"),
/*    */   
/* 49 */   NOT_SUPPORTED("notSupported"),
/*    */   
/* 51 */   OBJECT_NOT_FOUND("objectNotFound"),
/*    */   
/* 53 */   PERMISSION_DENIED("permissionDenied"),
/*    */   
/* 55 */   RUNTIME("runtime"),
/*    */   
/* 57 */   STORAGE("storage"),
/*    */   
/* 59 */   STREAM_NOT_SUPPORTED("streamNotSupported"),
/*    */   
/* 61 */   UPDATE_CONFLICT("updateConflict"),
/*    */   
/* 63 */   VERSIONING("versioning");
/*    */   
/*    */   private final String value;
/*    */   
/*    */   EnumServiceException(String v) {
/* 68 */     this.value = v;
/*    */   }
/*    */   
/*    */   public String value() {
/* 72 */     return this.value;
/*    */   }
/*    */   
/*    */   public static EnumServiceException fromValue(String v) {
/* 76 */     for (EnumServiceException c : values()) {
/* 77 */       if (c.value.equals(v)) {
/* 78 */         return c;
/*    */       }
/*    */     } 
/* 81 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }


/* Location:              E:\web\java_work\jd-gui-windows-1.6.6\chemistry-opencmis-commons-impl-1.1.0.jar!\org\apache\chemistry\opencmis\commons\impl\jaxb\EnumServiceException.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */