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
/*    */ @XmlType(name = "cmisPropertyBooleanDefinitionType", namespace = "http://docs.oasis-open.org/ns/cmis/core/200908/", propOrder = {"defaultValue", "choice"})
/*    */ public class CmisPropertyBooleanDefinitionType
/*    */   extends CmisPropertyDefinitionType
/*    */ {
/*    */   protected CmisPropertyBoolean defaultValue;
/*    */   protected List<CmisChoiceBoolean> choice;
/*    */   
/*    */   public CmisPropertyBoolean getDefaultValue() {
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
/*    */   public void setDefaultValue(CmisPropertyBoolean value) {
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
/*    */   public List<CmisChoiceBoolean> getChoice() {
/* 91 */     if (this.choice == null) {
/* 92 */       this.choice = new ArrayList<>();
/*    */     }
/* 94 */     return this.choice;
/*    */   }
/*    */ }


/* Location:              E:\web\java_work\jd-gui-windows-1.6.6\chemistry-opencmis-commons-impl-1.1.0.jar!\org\apache\chemistry\opencmis\commons\impl\jaxb\CmisPropertyBooleanDefinitionType.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */