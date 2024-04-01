/*    */ package org.apache.chemistry.opencmis.commons.impl.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlAccessType;
/*    */ import javax.xml.bind.annotation.XmlAccessorType;
/*    */ import javax.xml.bind.annotation.XmlElement;
/*    */ import javax.xml.bind.annotation.XmlRootElement;
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
/*    */ @XmlType(name = "", propOrder = {"types"})
/*    */ @XmlRootElement(name = "getTypeChildrenResponse")
/*    */ public class GetTypeChildrenResponse
/*    */ {
/*    */   @XmlElement(required = true)
/*    */   protected CmisTypeDefinitionListType types;
/*    */   
/*    */   public CmisTypeDefinitionListType getTypes() {
/* 49 */     return this.types;
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
/*    */   public void setTypes(CmisTypeDefinitionListType value) {
/* 61 */     this.types = value;
/*    */   }
/*    */ }


/* Location:              E:\web\java_work\jd-gui-windows-1.6.6\chemistry-opencmis-commons-impl-1.1.0.jar!\org\apache\chemistry\opencmis\commons\impl\jaxb\GetTypeChildrenResponse.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */