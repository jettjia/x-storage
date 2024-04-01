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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @XmlType(name = "enumPropertiesDocument", namespace = "http://docs.oasis-open.org/ns/cmis/core/200908/")
/*    */ @XmlEnum
/*    */ public enum EnumPropertiesDocument
/*    */ {
/* 41 */   CMIS_IS_IMMUTABLE("cmis:isImmutable"),
/*    */   
/* 43 */   CMIS_IS_LATEST_VERSION("cmis:isLatestVersion"),
/*    */   
/* 45 */   CMIS_IS_MAJOR_VERSION("cmis:isMajorVersion"),
/*    */   
/* 47 */   CMIS_IS_LATEST_MAJOR_VERSION("cmis:isLatestMajorVersion"),
/*    */   
/* 49 */   CMIS_IS_PRIVATE_WORKING_COPY("cmis:isPrivateWorkingCopy"),
/*    */   
/* 51 */   CMIS_VERSION_LABEL("cmis:versionLabel"),
/*    */   
/* 53 */   CMIS_VERSION_SERIES_ID("cmis:versionSeriesId"),
/*    */   
/* 55 */   CMIS_IS_VERSION_SERIES_CHECKED_OUT("cmis:isVersionSeriesCheckedOut"),
/*    */   
/* 57 */   CMIS_VERSION_SERIES_CHECKED_OUT_BY("cmis:versionSeriesCheckedOutBy"),
/*    */   
/* 59 */   CMIS_VERSION_SERIES_CHECKED_OUT_ID("cmis:versionSeriesCheckedOutId"),
/*    */   
/* 61 */   CMIS_CHECKIN_COMMENT("cmis:checkinComment"),
/*    */   
/* 63 */   CMIS_CONTENT_STREAM_LENGTH("cmis:contentStreamLength"),
/*    */   
/* 65 */   CMIS_CONTENT_STREAM_MIME_TYPE("cmis:contentStreamMimeType"),
/*    */   
/* 67 */   CMIS_CONTENT_STREAM_FILE_NAME("cmis:contentStreamFileName"),
/*    */   
/* 69 */   CMIS_CONTENT_STREAM_ID("cmis:contentStreamId");
/*    */   
/*    */   private final String value;
/*    */   
/*    */   EnumPropertiesDocument(String v) {
/* 74 */     this.value = v;
/*    */   }
/*    */   
/*    */   public String value() {
/* 78 */     return this.value;
/*    */   }
/*    */   
/*    */   public static EnumPropertiesDocument fromValue(String v) {
/* 82 */     for (EnumPropertiesDocument c : values()) {
/* 83 */       if (c.value.equals(v)) {
/* 84 */         return c;
/*    */       }
/*    */     } 
/* 87 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }


/* Location:              E:\web\java_work\jd-gui-windows-1.6.6\chemistry-opencmis-commons-impl-1.1.0.jar!\org\apache\chemistry\opencmis\commons\impl\jaxb\EnumPropertiesDocument.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */