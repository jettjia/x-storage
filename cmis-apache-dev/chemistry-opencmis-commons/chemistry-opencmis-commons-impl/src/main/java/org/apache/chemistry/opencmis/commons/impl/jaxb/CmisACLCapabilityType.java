/*     */ package org.apache.chemistry.opencmis.commons.impl.jaxb;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ import javax.xml.bind.annotation.XmlSchemaType;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name = "cmisACLCapabilityType", namespace = "http://docs.oasis-open.org/ns/cmis/core/200908/", propOrder = {"supportedPermissions", "propagation", "permissions", "mapping"})
/*     */ public class CmisACLCapabilityType
/*     */ {
/*     */   @XmlElement(required = true)
/*     */   @XmlSchemaType(name = "string")
/*     */   protected EnumSupportedPermissions supportedPermissions;
/*     */   @XmlElement(required = true)
/*     */   @XmlSchemaType(name = "string")
/*     */   protected EnumACLPropagation propagation;
/*     */   @XmlElement(required = true)
/*     */   protected List<CmisPermissionDefinition> permissions;
/*     */   protected List<CmisPermissionMapping> mapping;
/*     */   
/*     */   public EnumSupportedPermissions getSupportedPermissions() {
/*  63 */     return this.supportedPermissions;
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
/*     */   public void setSupportedPermissions(EnumSupportedPermissions value) {
/*  75 */     this.supportedPermissions = value;
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
/*     */   public EnumACLPropagation getPropagation() {
/*  87 */     return this.propagation;
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
/*     */   public void setPropagation(EnumACLPropagation value) {
/*  99 */     this.propagation = value;
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
/*     */   public List<CmisPermissionDefinition> getPermissions() {
/* 125 */     if (this.permissions == null) {
/* 126 */       this.permissions = new ArrayList<>();
/*     */     }
/* 128 */     return this.permissions;
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
/*     */   public List<CmisPermissionMapping> getMapping() {
/* 154 */     if (this.mapping == null) {
/* 155 */       this.mapping = new ArrayList<>();
/*     */     }
/* 157 */     return this.mapping;
/*     */   }
/*     */ }


/* Location:              E:\web\java_work\jd-gui-windows-1.6.6\chemistry-opencmis-commons-impl-1.1.0.jar!\org\apache\chemistry\opencmis\commons\impl\jaxb\CmisACLCapabilityType.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */