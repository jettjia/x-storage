/*    */ package org.apache.chemistry.opencmis.commons.impl.jaxb;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ import javax.xml.bind.annotation.XmlAccessType;
/*    */ import javax.xml.bind.annotation.XmlAccessorType;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @XmlAccessorType(XmlAccessType.FIELD)
/*    */ @XmlType(name = "cmisPropertyHtmlDefinitionType", namespace = "http://docs.oasis-open.org/ns/cmis/core/200908/", propOrder = {"defaultValue", "choice"})
/*    */ public class CmisPropertyHtmlDefinitionType
/*    */   extends CmisPropertyDefinitionType
/*    */ {
/*    */   protected CmisPropertyHtml defaultValue;
/*    */   protected List<CmisChoiceHtml> choice;
/*    */   
/*    */   public CmisPropertyHtml getDefaultValue() {
/* 53 */     return this.defaultValue;
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
/*    */   public void setDefaultValue(CmisPropertyHtml value) {
/* 65 */     this.defaultValue = value;
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
/*    */   public List<CmisChoiceHtml> getChoice() {
/* 91 */     if (this.choice == null) {
/* 92 */       this.choice = new ArrayList<>();
/*    */     }
/* 94 */     return this.choice;
/*    */   }
/*    */ }


/* Location:              E:\web\java_work\jd-gui-windows-1.6.6\chemistry-opencmis-commons-impl-1.1.0.jar!\org\apache\chemistry\opencmis\commons\impl\jaxb\CmisPropertyHtmlDefinitionType.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */