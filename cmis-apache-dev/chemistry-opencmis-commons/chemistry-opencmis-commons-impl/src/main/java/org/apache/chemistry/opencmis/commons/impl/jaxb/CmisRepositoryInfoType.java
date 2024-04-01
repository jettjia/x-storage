/*     */ package org.apache.chemistry.opencmis.commons.impl.jaxb;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlAnyAttribute;
/*     */ import javax.xml.bind.annotation.XmlAnyElement;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ import javax.xml.bind.annotation.XmlSchemaType;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ import javax.xml.namespace.QName;
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
/*     */ @XmlType(name = "cmisRepositoryInfoType", namespace = "http://docs.oasis-open.org/ns/cmis/core/200908/", propOrder = {"repositoryId", "repositoryName", "repositoryDescription", "vendorName", "productName", "productVersion", "rootFolderId", "latestChangeLogToken", "capabilities", "aclCapability", "cmisVersionSupported", "thinClientURI", "changesIncomplete", "changesOnType", "principalAnonymous", "principalAnyone", "extendedFeatures", "any"})
/*     */ public class CmisRepositoryInfoType
/*     */ {
/*     */   @XmlElement(required = true)
/*     */   protected String repositoryId;
/*     */   @XmlElement(required = true)
/*     */   protected String repositoryName;
/*     */   @XmlElement(required = true)
/*     */   protected String repositoryDescription;
/*     */   @XmlElement(required = true)
/*     */   protected String vendorName;
/*     */   @XmlElement(required = true)
/*     */   protected String productName;
/*     */   @XmlElement(required = true)
/*     */   protected String productVersion;
/*     */   @XmlElement(required = true)
/*     */   protected String rootFolderId;
/*     */   protected String latestChangeLogToken;
/*     */   @XmlElement(required = true)
/*     */   protected CmisRepositoryCapabilitiesType capabilities;
/*     */   protected CmisACLCapabilityType aclCapability;
/*     */   @XmlElement(required = true)
/*     */   protected String cmisVersionSupported;
/*     */   @XmlSchemaType(name = "anyURI")
/*     */   protected String thinClientURI;
/*     */   protected Boolean changesIncomplete;
/*     */   @XmlSchemaType(name = "string")
/*     */   protected List<EnumBaseObjectTypeIds> changesOnType;
/*     */   protected String principalAnonymous;
/*     */   protected String principalAnyone;
/*     */   protected List<CmisExtensionFeatureType> extendedFeatures;
/*     */   @XmlAnyElement(lax = true)
/*     */   protected List<Object> any;
/*     */   @XmlAnyAttribute
/* 110 */   private Map<QName, String> otherAttributes = new HashMap<>();
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
/*     */   public String getRepositoryId() {
/* 122 */     return this.repositoryId;
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
/*     */   public void setRepositoryId(String value) {
/* 134 */     this.repositoryId = value;
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
/*     */   public String getRepositoryName() {
/* 146 */     return this.repositoryName;
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
/*     */   public void setRepositoryName(String value) {
/* 158 */     this.repositoryName = value;
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
/*     */   public String getRepositoryDescription() {
/* 170 */     return this.repositoryDescription;
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
/*     */   public void setRepositoryDescription(String value) {
/* 182 */     this.repositoryDescription = value;
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
/*     */   public String getVendorName() {
/* 194 */     return this.vendorName;
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
/*     */   public void setVendorName(String value) {
/* 206 */     this.vendorName = value;
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
/*     */   public String getProductName() {
/* 218 */     return this.productName;
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
/*     */   public void setProductName(String value) {
/* 230 */     this.productName = value;
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
/*     */   public String getProductVersion() {
/* 242 */     return this.productVersion;
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
/*     */   public void setProductVersion(String value) {
/* 254 */     this.productVersion = value;
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
/*     */   public String getRootFolderId() {
/* 266 */     return this.rootFolderId;
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
/*     */   public void setRootFolderId(String value) {
/* 278 */     this.rootFolderId = value;
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
/*     */   public String getLatestChangeLogToken() {
/* 290 */     return this.latestChangeLogToken;
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
/*     */   public void setLatestChangeLogToken(String value) {
/* 302 */     this.latestChangeLogToken = value;
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
/*     */   public CmisRepositoryCapabilitiesType getCapabilities() {
/* 314 */     return this.capabilities;
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
/*     */   public void setCapabilities(CmisRepositoryCapabilitiesType value) {
/* 326 */     this.capabilities = value;
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
/*     */   public CmisACLCapabilityType getAclCapability() {
/* 338 */     return this.aclCapability;
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
/*     */   public void setAclCapability(CmisACLCapabilityType value) {
/* 350 */     this.aclCapability = value;
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
/*     */   public String getCmisVersionSupported() {
/* 362 */     return this.cmisVersionSupported;
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
/*     */   public void setCmisVersionSupported(String value) {
/* 374 */     this.cmisVersionSupported = value;
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
/*     */   public String getThinClientURI() {
/* 386 */     return this.thinClientURI;
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
/*     */   public void setThinClientURI(String value) {
/* 398 */     this.thinClientURI = value;
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
/*     */   public Boolean isChangesIncomplete() {
/* 410 */     return this.changesIncomplete;
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
/*     */   public void setChangesIncomplete(Boolean value) {
/* 422 */     this.changesIncomplete = value;
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
/*     */   public List<EnumBaseObjectTypeIds> getChangesOnType() {
/* 448 */     if (this.changesOnType == null) {
/* 449 */       this.changesOnType = new ArrayList<>();
/*     */     }
/* 451 */     return this.changesOnType;
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
/*     */   public String getPrincipalAnonymous() {
/* 463 */     return this.principalAnonymous;
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
/*     */   public void setPrincipalAnonymous(String value) {
/* 475 */     this.principalAnonymous = value;
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
/*     */   public String getPrincipalAnyone() {
/* 487 */     return this.principalAnyone;
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
/*     */   public void setPrincipalAnyone(String value) {
/* 499 */     this.principalAnyone = value;
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
/*     */   public List<CmisExtensionFeatureType> getExtendedFeatures() {
/* 525 */     if (this.extendedFeatures == null) {
/* 526 */       this.extendedFeatures = new ArrayList<>();
/*     */     }
/* 528 */     return this.extendedFeatures;
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
/* 555 */     if (this.any == null) {
/* 556 */       this.any = new ArrayList();
/*     */     }
/* 558 */     return this.any;
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
/*     */   public Map<QName, String> getOtherAttributes() {
/* 576 */     return this.otherAttributes;
/*     */   }
/*     */ }


/* Location:              E:\web\java_work\jd-gui-windows-1.6.6\chemistry-opencmis-commons-impl-1.1.0.jar!\org\apache\chemistry\opencmis\commons\impl\jaxb\CmisRepositoryInfoType.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */