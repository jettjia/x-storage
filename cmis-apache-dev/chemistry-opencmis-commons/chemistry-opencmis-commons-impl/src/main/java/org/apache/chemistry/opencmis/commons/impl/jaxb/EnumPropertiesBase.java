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
/*    */ 
/*    */ @XmlType(name = "enumPropertiesBase", namespace = "http://docs.oasis-open.org/ns/cmis/core/200908/")
/*    */ @XmlEnum
/*    */ public enum EnumPropertiesBase
/*    */ {
/* 37 */   CMIS_NAME("cmis:name"),
/*    */   
/* 39 */   CMIS_DESCRIPTION("cmis:description"),
/*    */   
/* 41 */   CMIS_OBJECT_ID("cmis:objectId"),
/*    */   
/* 43 */   CMIS_OBJECT_TYPE_ID("cmis:objectTypeId"),
/*    */   
/* 45 */   CMIS_BASE_TYPE_ID("cmis:baseTypeId"),
/*    */   
/* 47 */   CMIS_SECONDARY_OBJECT_TYPE_IDS("cmis:secondaryObjectTypeIds"),
/*    */   
/* 49 */   CMIS_CREATED_BY("cmis:createdBy"),
/*    */   
/* 51 */   CMIS_CREATION_DATE("cmis:creationDate"),
/*    */   
/* 53 */   CMIS_LAST_MODIFIED_BY("cmis:lastModifiedBy"),
/*    */   
/* 55 */   CMIS_LAST_MODIFICATION_DATE("cmis:lastModificationDate"),
/*    */   
/* 57 */   CMIS_CHANGE_TOKEN("cmis:changeToken");
/*    */   
/*    */   private final String value;
/*    */   
/*    */   EnumPropertiesBase(String v) {
/* 62 */     this.value = v;
/*    */   }
/*    */   
/*    */   public String value() {
/* 66 */     return this.value;
/*    */   }
/*    */   
/*    */   public static EnumPropertiesBase fromValue(String v) {
/* 70 */     for (EnumPropertiesBase c : values()) {
/* 71 */       if (c.value.equals(v)) {
/* 72 */         return c;
/*    */       }
/*    */     } 
/* 75 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }


/* Location:              E:\web\java_work\jd-gui-windows-1.6.6\chemistry-opencmis-commons-impl-1.1.0.jar!\org\apache\chemistry\opencmis\commons\impl\jaxb\EnumPropertiesBase.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */