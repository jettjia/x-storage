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
/*    */ @XmlType(name = "enumBaseObjectTypeIds", namespace = "http://docs.oasis-open.org/ns/cmis/core/200908/")
/*    */ @XmlEnum
/*    */ public enum EnumBaseObjectTypeIds
/*    */ {
/* 32 */   CMIS_DOCUMENT("cmis:document"),
/*    */   
/* 34 */   CMIS_FOLDER("cmis:folder"),
/*    */   
/* 36 */   CMIS_RELATIONSHIP("cmis:relationship"),
/*    */   
/* 38 */   CMIS_POLICY("cmis:policy"),
/*    */   
/* 40 */   CMIS_ITEM("cmis:item"),
/*    */   
/* 42 */   CMIS_SECONDARY("cmis:secondary");
/*    */   
/*    */   private final String value;
/*    */   
/*    */   EnumBaseObjectTypeIds(String v) {
/* 47 */     this.value = v;
/*    */   }
/*    */   
/*    */   public String value() {
/* 51 */     return this.value;
/*    */   }
/*    */   
/*    */   public static EnumBaseObjectTypeIds fromValue(String v) {
/* 55 */     for (EnumBaseObjectTypeIds c : values()) {
/* 56 */       if (c.value.equals(v)) {
/* 57 */         return c;
/*    */       }
/*    */     } 
/* 60 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }


/* Location:              E:\web\java_work\jd-gui-windows-1.6.6\chemistry-opencmis-commons-impl-1.1.0.jar!\org\apache\chemistry\opencmis\commons\impl\jaxb\EnumBaseObjectTypeIds.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */