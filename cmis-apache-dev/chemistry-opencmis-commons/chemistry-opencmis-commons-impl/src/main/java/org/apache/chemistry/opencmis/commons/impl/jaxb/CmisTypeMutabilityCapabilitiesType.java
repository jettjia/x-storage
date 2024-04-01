/*     */ package org.apache.chemistry.opencmis.commons.impl.jaxb;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlAnyElement;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name = "cmisTypeMutabilityCapabilitiesType", namespace = "http://docs.oasis-open.org/ns/cmis/core/200908/", propOrder = {"create", "update", "delete", "any"})
/*     */ public class CmisTypeMutabilityCapabilitiesType
/*     */ {
/*     */   protected boolean create;
/*     */   protected boolean update;
/*     */   protected boolean delete;
/*     */   @XmlAnyElement(lax = true)
/*     */   protected List<Object> any;
/*     */   
/*     */   public boolean isCreate() {
/*  55 */     return this.create;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCreate(boolean value) {
/*  63 */     this.create = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isUpdate() {
/*  71 */     return this.update;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setUpdate(boolean value) {
/*  79 */     this.update = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isDelete() {
/*  87 */     return this.delete;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDelete(boolean value) {
/*  95 */     this.delete = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public List<Object> getAny() {
/* 122 */     if (this.any == null) {
/* 123 */       this.any = new ArrayList();
/*     */     }
/* 125 */     return this.any;
/*     */   }
/*     */ }


/* Location:              E:\web\java_work\jd-gui-windows-1.6.6\chemistry-opencmis-commons-impl-1.1.0.jar!\org\apache\chemistry\opencmis\commons\impl\jaxb\CmisTypeMutabilityCapabilitiesType.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */