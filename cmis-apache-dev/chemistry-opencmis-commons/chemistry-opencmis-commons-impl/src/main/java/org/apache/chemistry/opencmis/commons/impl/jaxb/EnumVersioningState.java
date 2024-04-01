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
/*    */ @XmlType(name = "enumVersioningState", namespace = "http://docs.oasis-open.org/ns/cmis/core/200908/")
/*    */ @XmlEnum
/*    */ public enum EnumVersioningState
/*    */ {
/* 30 */   NONE("none"),
/*    */   
/* 32 */   CHECKEDOUT("checkedout"),
/*    */   
/* 34 */   MINOR("minor"),
/*    */   
/* 36 */   MAJOR("major");
/*    */   
/*    */   private final String value;
/*    */   
/*    */   EnumVersioningState(String v) {
/* 41 */     this.value = v;
/*    */   }
/*    */   
/*    */   public String value() {
/* 45 */     return this.value;
/*    */   }
/*    */   
/*    */   public static EnumVersioningState fromValue(String v) {
/* 49 */     for (EnumVersioningState c : values()) {
/* 50 */       if (c.value.equals(v)) {
/* 51 */         return c;
/*    */       }
/*    */     } 
/* 54 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }


/* Location:              E:\web\java_work\jd-gui-windows-1.6.6\chemistry-opencmis-commons-impl-1.1.0.jar!\org\apache\chemistry\opencmis\commons\impl\jaxb\EnumVersioningState.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */