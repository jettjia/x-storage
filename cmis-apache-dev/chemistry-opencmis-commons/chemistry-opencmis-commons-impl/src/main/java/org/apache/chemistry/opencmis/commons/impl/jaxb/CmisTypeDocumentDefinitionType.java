/*    */ package org.apache.chemistry.opencmis.commons.impl.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlAccessType;
/*    */ import javax.xml.bind.annotation.XmlAccessorType;
/*    */ import javax.xml.bind.annotation.XmlElement;
/*    */ import javax.xml.bind.annotation.XmlSchemaType;
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
/*    */ 
/*    */ @XmlAccessorType(XmlAccessType.FIELD)
/*    */ @XmlType(name = "cmisTypeDocumentDefinitionType", namespace = "http://docs.oasis-open.org/ns/cmis/core/200908/", propOrder = {"versionable", "contentStreamAllowed"})
/*    */ public class CmisTypeDocumentDefinitionType
/*    */   extends CmisTypeDefinitionType
/*    */ {
/*    */   protected boolean versionable;
/*    */   @XmlElement(required = true)
/*    */   @XmlSchemaType(name = "string")
/*    */   protected EnumContentStreamAllowed contentStreamAllowed;
/*    */   
/*    */   public boolean isVersionable() {
/* 51 */     return this.versionable;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setVersionable(boolean value) {
/* 59 */     this.versionable = value;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public EnumContentStreamAllowed getContentStreamAllowed() {
/* 71 */     return this.contentStreamAllowed;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setContentStreamAllowed(EnumContentStreamAllowed value) {
/* 83 */     this.contentStreamAllowed = value;
/*    */   }
/*    */ }


/* Location:              E:\web\java_work\jd-gui-windows-1.6.6\chemistry-opencmis-commons-impl-1.1.0.jar!\org\apache\chemistry\opencmis\commons\impl\jaxb\CmisTypeDocumentDefinitionType.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */