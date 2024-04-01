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
/*    */ @XmlType(name = "enumACLPropagation", namespace = "http://docs.oasis-open.org/ns/cmis/core/200908/")
/*    */ @XmlEnum
/*    */ public enum EnumACLPropagation
/*    */ {
/* 29 */   REPOSITORYDETERMINED("repositorydetermined"),
/*    */   
/* 31 */   OBJECTONLY("objectonly"),
/*    */   
/* 33 */   PROPAGATE("propagate");
/*    */   
/*    */   private final String value;
/*    */   
/*    */   EnumACLPropagation(String v) {
/* 38 */     this.value = v;
/*    */   }
/*    */   
/*    */   public String value() {
/* 42 */     return this.value;
/*    */   }
/*    */   
/*    */   public static EnumACLPropagation fromValue(String v) {
/* 46 */     for (EnumACLPropagation c : values()) {
/* 47 */       if (c.value.equals(v)) {
/* 48 */         return c;
/*    */       }
/*    */     } 
/* 51 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }


/* Location:              E:\web\java_work\jd-gui-windows-1.6.6\chemistry-opencmis-commons-impl-1.1.0.jar!\org\apache\chemistry\opencmis\commons\impl\jaxb\EnumACLPropagation.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */