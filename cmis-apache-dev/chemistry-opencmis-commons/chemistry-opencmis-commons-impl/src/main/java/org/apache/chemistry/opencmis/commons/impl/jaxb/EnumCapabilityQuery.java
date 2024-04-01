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
/*    */ @XmlType(name = "enumCapabilityQuery", namespace = "http://docs.oasis-open.org/ns/cmis/core/200908/")
/*    */ @XmlEnum
/*    */ public enum EnumCapabilityQuery
/*    */ {
/* 31 */   NONE("none"),
/*    */   
/* 33 */   METADATAONLY("metadataonly"),
/*    */   
/* 35 */   FULLTEXTONLY("fulltextonly"),
/*    */   
/* 37 */   BOTHSEPARATE("bothseparate"),
/*    */   
/* 39 */   BOTHCOMBINED("bothcombined");
/*    */   
/*    */   private final String value;
/*    */   
/*    */   EnumCapabilityQuery(String v) {
/* 44 */     this.value = v;
/*    */   }
/*    */   
/*    */   public String value() {
/* 48 */     return this.value;
/*    */   }
/*    */   
/*    */   public static EnumCapabilityQuery fromValue(String v) {
/* 52 */     for (EnumCapabilityQuery c : values()) {
/* 53 */       if (c.value.equals(v)) {
/* 54 */         return c;
/*    */       }
/*    */     } 
/* 57 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }


/* Location:              E:\web\java_work\jd-gui-windows-1.6.6\chemistry-opencmis-commons-impl-1.1.0.jar!\org\apache\chemistry\opencmis\commons\impl\jaxb\EnumCapabilityQuery.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */