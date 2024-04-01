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
/*    */ @XmlType(name = "enumRenditionKind", namespace = "http://docs.oasis-open.org/ns/cmis/core/200908/")
/*    */ @XmlEnum
/*    */ public enum EnumRenditionKind
/*    */ {
/* 27 */   CMIS_THUMBNAIL("cmis:thumbnail");
/*    */   
/*    */   private final String value;
/*    */   
/*    */   EnumRenditionKind(String v) {
/* 32 */     this.value = v;
/*    */   }
/*    */   
/*    */   public String value() {
/* 36 */     return this.value;
/*    */   }
/*    */   
/*    */   public static EnumRenditionKind fromValue(String v) {
/* 40 */     for (EnumRenditionKind c : values()) {
/* 41 */       if (c.value.equals(v)) {
/* 42 */         return c;
/*    */       }
/*    */     } 
/* 45 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }


/* Location:              E:\web\java_work\jd-gui-windows-1.6.6\chemistry-opencmis-commons-impl-1.1.0.jar!\org\apache\chemistry\opencmis\commons\impl\jaxb\EnumRenditionKind.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */