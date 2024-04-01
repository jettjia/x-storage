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
/*    */ @XmlType(name = "enumUsers", namespace = "http://docs.oasis-open.org/ns/cmis/core/200908/")
/*    */ @XmlEnum
/*    */ public enum EnumUsers
/*    */ {
/* 36 */   CMIS_USER("cmis:user");
/*    */   
/*    */   private final String value;
/*    */   
/*    */   EnumUsers(String v) {
/* 41 */     this.value = v;
/*    */   }
/*    */   
/*    */   public String value() {
/* 45 */     return this.value;
/*    */   }
/*    */   
/*    */   public static EnumUsers fromValue(String v) {
/* 49 */     for (EnumUsers c : values()) {
/* 50 */       if (c.value.equals(v)) {
/* 51 */         return c;
/*    */       }
/*    */     } 
/* 54 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }


/* Location:              E:\web\java_work\jd-gui-windows-1.6.6\chemistry-opencmis-commons-impl-1.1.0.jar!\org\apache\chemistry\opencmis\commons\impl\jaxb\EnumUsers.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */