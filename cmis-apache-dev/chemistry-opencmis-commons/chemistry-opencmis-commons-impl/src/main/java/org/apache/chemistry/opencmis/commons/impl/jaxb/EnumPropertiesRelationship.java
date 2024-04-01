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
/*    */ @XmlType(name = "enumPropertiesRelationship", namespace = "http://docs.oasis-open.org/ns/cmis/core/200908/")
/*    */ @XmlEnum
/*    */ public enum EnumPropertiesRelationship
/*    */ {
/* 28 */   CMIS_SOURCE_ID("cmis:sourceId"),
/*    */   
/* 30 */   CMIS_TARGET_ID("cmis:targetId");
/*    */   
/*    */   private final String value;
/*    */   
/*    */   EnumPropertiesRelationship(String v) {
/* 35 */     this.value = v;
/*    */   }
/*    */   
/*    */   public String value() {
/* 39 */     return this.value;
/*    */   }
/*    */   
/*    */   public static EnumPropertiesRelationship fromValue(String v) {
/* 43 */     for (EnumPropertiesRelationship c : values()) {
/* 44 */       if (c.value.equals(v)) {
/* 45 */         return c;
/*    */       }
/*    */     } 
/* 48 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }


/* Location:              E:\web\java_work\jd-gui-windows-1.6.6\chemistry-opencmis-commons-impl-1.1.0.jar!\org\apache\chemistry\opencmis\commons\impl\jaxb\EnumPropertiesRelationship.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */