/*    */ package org.apache.chemistry.opencmis.commons.impl.jaxb;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ import javax.xml.bind.annotation.XmlAccessType;
/*    */ import javax.xml.bind.annotation.XmlAccessorType;
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
/*    */ @XmlType(name = "", propOrder = {"parents"})
/*    */ @XmlRootElement(name = "getObjectParentsResponse")
/*    */ public class GetObjectParentsResponse
/*    */ {
/*    */   protected List<CmisObjectParentsType> parents;
/*    */   
/*    */   public List<CmisObjectParentsType> getParents() {
/* 63 */     if (this.parents == null) {
/* 64 */       this.parents = new ArrayList<>();
/*    */     }
/* 66 */     return this.parents;
/*    */   }
/*    */ }


/* Location:              E:\web\java_work\jd-gui-windows-1.6.6\chemistry-opencmis-commons-impl-1.1.0.jar!\org\apache\chemistry\opencmis\commons\impl\jaxb\GetObjectParentsResponse.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */