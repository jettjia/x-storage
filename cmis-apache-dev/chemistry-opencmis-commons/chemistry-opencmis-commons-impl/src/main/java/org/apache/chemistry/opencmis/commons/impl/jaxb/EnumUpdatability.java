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
/*    */ @XmlType(name = "enumUpdatability", namespace = "http://docs.oasis-open.org/ns/cmis/core/200908/")
/*    */ @XmlEnum
/*    */ public enum EnumUpdatability
/*    */ {
/* 30 */   READONLY("readonly"),
/*    */   
/* 32 */   READWRITE("readwrite"),
/*    */   
/* 34 */   WHENCHECKEDOUT("whencheckedout"),
/*    */   
/* 36 */   ONCREATE("oncreate");
/*    */   
/*    */   private final String value;
/*    */   
/*    */   EnumUpdatability(String v) {
/* 41 */     this.value = v;
/*    */   }
/*    */   
/*    */   public String value() {
/* 45 */     return this.value;
/*    */   }
/*    */   
/*    */   public static EnumUpdatability fromValue(String v) {
/* 49 */     for (EnumUpdatability c : values()) {
/* 50 */       if (c.value.equals(v)) {
/* 51 */         return c;
/*    */       }
/*    */     } 
/* 54 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }


/* Location:              E:\web\java_work\jd-gui-windows-1.6.6\chemistry-opencmis-commons-impl-1.1.0.jar!\org\apache\chemistry\opencmis\commons\impl\jaxb\EnumUpdatability.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */