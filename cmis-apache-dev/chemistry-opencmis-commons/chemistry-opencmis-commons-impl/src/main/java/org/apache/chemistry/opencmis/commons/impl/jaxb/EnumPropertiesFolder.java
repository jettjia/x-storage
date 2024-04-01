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
/*    */ @XmlType(name = "enumPropertiesFolder", namespace = "http://docs.oasis-open.org/ns/cmis/core/200908/")
/*    */ @XmlEnum
/*    */ public enum EnumPropertiesFolder
/*    */ {
/* 29 */   CMIS_PARENT_ID("cmis:parentId"),
/*    */   
/* 31 */   CMIS_ALLOWED_CHILD_OBJECT_TYPE_IDS("cmis:allowedChildObjectTypeIds"),
/*    */   
/* 33 */   CMIS_PATH("cmis:path");
/*    */   
/*    */   private final String value;
/*    */   
/*    */   EnumPropertiesFolder(String v) {
/* 38 */     this.value = v;
/*    */   }
/*    */   
/*    */   public String value() {
/* 42 */     return this.value;
/*    */   }
/*    */   
/*    */   public static EnumPropertiesFolder fromValue(String v) {
/* 46 */     for (EnumPropertiesFolder c : values()) {
/* 47 */       if (c.value.equals(v)) {
/* 48 */         return c;
/*    */       }
/*    */     } 
/* 51 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }


/* Location:              E:\web\java_work\jd-gui-windows-1.6.6\chemistry-opencmis-commons-impl-1.1.0.jar!\org\apache\chemistry\opencmis\commons\impl\jaxb\EnumPropertiesFolder.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */