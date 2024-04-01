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
/*    */ @XmlType(name = "enumPropertyType", namespace = "http://docs.oasis-open.org/ns/cmis/core/200908/")
/*    */ @XmlEnum
/*    */ public enum EnumPropertyType
/*    */ {
/* 34 */   BOOLEAN("boolean"),
/*    */   
/* 36 */   ID("id"),
/*    */   
/* 38 */   INTEGER("integer"),
/*    */   
/* 40 */   DATETIME("datetime"),
/*    */   
/* 42 */   DECIMAL("decimal"),
/*    */   
/* 44 */   HTML("html"),
/*    */   
/* 46 */   STRING("string"),
/*    */   
/* 48 */   URI("uri");
/*    */   
/*    */   private final String value;
/*    */   
/*    */   EnumPropertyType(String v) {
/* 53 */     this.value = v;
/*    */   }
/*    */   
/*    */   public String value() {
/* 57 */     return this.value;
/*    */   }
/*    */   
/*    */   public static EnumPropertyType fromValue(String v) {
/* 61 */     for (EnumPropertyType c : values()) {
/* 62 */       if (c.value.equals(v)) {
/* 63 */         return c;
/*    */       }
/*    */     } 
/* 66 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }


/* Location:              E:\web\java_work\jd-gui-windows-1.6.6\chemistry-opencmis-commons-impl-1.1.0.jar!\org\apache\chemistry\opencmis\commons\impl\jaxb\EnumPropertyType.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */