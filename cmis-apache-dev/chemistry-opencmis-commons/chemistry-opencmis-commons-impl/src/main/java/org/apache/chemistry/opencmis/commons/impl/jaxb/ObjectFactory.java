/*      */ package org.apache.chemistry.opencmis.commons.impl.jaxb;
/*      */ 
/*      */ import java.math.BigInteger;
/*      */ import javax.xml.bind.JAXBElement;
/*      */ import javax.xml.bind.annotation.XmlElementDecl;
/*      */ import javax.xml.bind.annotation.XmlRegistry;
/*      */ import javax.xml.namespace.QName;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ @XmlRegistry
/*      */ public class ObjectFactory
/*      */ {
/*   28 */   private static final QName _CmisFault_QNAME = new QName("http://docs.oasis-open.org/ns/cmis/messaging/200908/", "cmisFault");
/*   29 */   private static final QName _AllowableActions_QNAME = new QName("http://docs.oasis-open.org/ns/cmis/core/200908/", "allowableActions");
/*   30 */   private static final QName _Query_QNAME = new QName("http://docs.oasis-open.org/ns/cmis/core/200908/", "query");
/*   31 */   private static final QName _Acl_QNAME = new QName("http://docs.oasis-open.org/ns/cmis/core/200908/", "acl");
/*   32 */   private static final QName _GetRepositoriesExtension_QNAME = new QName("http://docs.oasis-open.org/ns/cmis/messaging/200908/", "extension");
/*   33 */   private static final QName _GetTypeChildrenTypeId_QNAME = new QName("http://docs.oasis-open.org/ns/cmis/messaging/200908/", "typeId");
/*   34 */   private static final QName _GetTypeChildrenIncludePropertyDefinitions_QNAME = new QName("http://docs.oasis-open.org/ns/cmis/messaging/200908/", "includePropertyDefinitions");
/*   35 */   private static final QName _GetTypeChildrenMaxItems_QNAME = new QName("http://docs.oasis-open.org/ns/cmis/messaging/200908/", "maxItems");
/*   36 */   private static final QName _GetTypeChildrenSkipCount_QNAME = new QName("http://docs.oasis-open.org/ns/cmis/messaging/200908/", "skipCount");
/*   37 */   private static final QName _GetTypeDescendantsDepth_QNAME = new QName("http://docs.oasis-open.org/ns/cmis/messaging/200908/", "depth");
/*   38 */   private static final QName _GetDescendantsFilter_QNAME = new QName("http://docs.oasis-open.org/ns/cmis/messaging/200908/", "filter");
/*   39 */   private static final QName _GetDescendantsIncludeAllowableActions_QNAME = new QName("http://docs.oasis-open.org/ns/cmis/messaging/200908/", "includeAllowableActions");
/*   40 */   private static final QName _GetDescendantsIncludeRelationships_QNAME = new QName("http://docs.oasis-open.org/ns/cmis/messaging/200908/", "includeRelationships");
/*   41 */   private static final QName _GetDescendantsRenditionFilter_QNAME = new QName("http://docs.oasis-open.org/ns/cmis/messaging/200908/", "renditionFilter");
/*   42 */   private static final QName _GetDescendantsIncludePathSegment_QNAME = new QName("http://docs.oasis-open.org/ns/cmis/messaging/200908/", "includePathSegment");
/*   43 */   private static final QName _GetChildrenOrderBy_QNAME = new QName("http://docs.oasis-open.org/ns/cmis/messaging/200908/", "orderBy");
/*   44 */   private static final QName _GetObjectParentsIncludeRelativePathSegment_QNAME = new QName("http://docs.oasis-open.org/ns/cmis/messaging/200908/", "includeRelativePathSegment");
/*   45 */   private static final QName _GetCheckedOutDocsFolderId_QNAME = new QName("http://docs.oasis-open.org/ns/cmis/messaging/200908/", "folderId");
/*   46 */   private static final QName _CreateDocumentContentStream_QNAME = new QName("http://docs.oasis-open.org/ns/cmis/messaging/200908/", "contentStream");
/*   47 */   private static final QName _CreateDocumentVersioningState_QNAME = new QName("http://docs.oasis-open.org/ns/cmis/messaging/200908/", "versioningState");
/*   48 */   private static final QName _CreateDocumentAddACEs_QNAME = new QName("http://docs.oasis-open.org/ns/cmis/messaging/200908/", "addACEs");
/*   49 */   private static final QName _CreateDocumentRemoveACEs_QNAME = new QName("http://docs.oasis-open.org/ns/cmis/messaging/200908/", "removeACEs");
/*   50 */   private static final QName _GetObjectIncludePolicyIds_QNAME = new QName("http://docs.oasis-open.org/ns/cmis/messaging/200908/", "includePolicyIds");
/*   51 */   private static final QName _GetObjectIncludeACL_QNAME = new QName("http://docs.oasis-open.org/ns/cmis/messaging/200908/", "includeACL");
/*   52 */   private static final QName _GetContentStreamStreamId_QNAME = new QName("http://docs.oasis-open.org/ns/cmis/messaging/200908/", "streamId");
/*   53 */   private static final QName _GetContentStreamOffset_QNAME = new QName("http://docs.oasis-open.org/ns/cmis/messaging/200908/", "offset");
/*   54 */   private static final QName _GetContentStreamLength_QNAME = new QName("http://docs.oasis-open.org/ns/cmis/messaging/200908/", "length");
/*   55 */   private static final QName _UpdatePropertiesChangeToken_QNAME = new QName("http://docs.oasis-open.org/ns/cmis/messaging/200908/", "changeToken");
/*   56 */   private static final QName _DeleteObjectAllVersions_QNAME = new QName("http://docs.oasis-open.org/ns/cmis/messaging/200908/", "allVersions");
/*   57 */   private static final QName _DeleteTreeUnfileObjects_QNAME = new QName("http://docs.oasis-open.org/ns/cmis/messaging/200908/", "unfileObjects");
/*   58 */   private static final QName _DeleteTreeContinueOnFailure_QNAME = new QName("http://docs.oasis-open.org/ns/cmis/messaging/200908/", "continueOnFailure");
/*   59 */   private static final QName _SetContentStreamOverwriteFlag_QNAME = new QName("http://docs.oasis-open.org/ns/cmis/messaging/200908/", "overwriteFlag");
/*   60 */   private static final QName _AppendContentStreamIsLastChunk_QNAME = new QName("http://docs.oasis-open.org/ns/cmis/messaging/200908/", "isLastChunk");
/*   61 */   private static final QName _QuerySearchAllVersions_QNAME = new QName("http://docs.oasis-open.org/ns/cmis/messaging/200908/", "searchAllVersions");
/*   62 */   private static final QName _GetContentChangesChangeLogToken_QNAME = new QName("http://docs.oasis-open.org/ns/cmis/messaging/200908/", "changeLogToken");
/*   63 */   private static final QName _GetContentChangesIncludeProperties_QNAME = new QName("http://docs.oasis-open.org/ns/cmis/messaging/200908/", "includeProperties");
/*   64 */   private static final QName _CheckInMajor_QNAME = new QName("http://docs.oasis-open.org/ns/cmis/messaging/200908/", "major");
/*   65 */   private static final QName _CheckInProperties_QNAME = new QName("http://docs.oasis-open.org/ns/cmis/messaging/200908/", "properties");
/*   66 */   private static final QName _CheckInCheckinComment_QNAME = new QName("http://docs.oasis-open.org/ns/cmis/messaging/200908/", "checkinComment");
/*   67 */   private static final QName _GetObjectRelationshipsRelationshipDirection_QNAME = new QName("http://docs.oasis-open.org/ns/cmis/messaging/200908/", "relationshipDirection");
/*   68 */   private static final QName _GetACLOnlyBasicPermissions_QNAME = new QName("http://docs.oasis-open.org/ns/cmis/messaging/200908/", "onlyBasicPermissions");
/*   69 */   private static final QName _ApplyACLACLPropagation_QNAME = new QName("http://docs.oasis-open.org/ns/cmis/messaging/200908/", "ACLPropagation");
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public DeleteTreeResponse createDeleteTreeResponse() {
/*   83 */     return new DeleteTreeResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CmisFaultType createCmisFaultType() {
/*   91 */     return new CmisFaultType();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetRepositories createGetRepositories() {
/*   99 */     return new GetRepositories();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CmisExtensionType createCmisExtensionType() {
/*  107 */     return new CmisExtensionType();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetRepositoriesResponse createGetRepositoriesResponse() {
/*  115 */     return new GetRepositoriesResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CmisRepositoryEntryType createCmisRepositoryEntryType() {
/*  123 */     return new CmisRepositoryEntryType();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetRepositoryInfo createGetRepositoryInfo() {
/*  131 */     return new GetRepositoryInfo();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetRepositoryInfoResponse createGetRepositoryInfoResponse() {
/*  139 */     return new GetRepositoryInfoResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CmisRepositoryInfoType createCmisRepositoryInfoType() {
/*  147 */     return new CmisRepositoryInfoType();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetTypeChildren createGetTypeChildren() {
/*  155 */     return new GetTypeChildren();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetTypeChildrenResponse createGetTypeChildrenResponse() {
/*  163 */     return new GetTypeChildrenResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CmisTypeDefinitionListType createCmisTypeDefinitionListType() {
/*  171 */     return new CmisTypeDefinitionListType();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetTypeDescendants createGetTypeDescendants() {
/*  179 */     return new GetTypeDescendants();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetTypeDescendantsResponse createGetTypeDescendantsResponse() {
/*  187 */     return new GetTypeDescendantsResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CmisTypeContainer createCmisTypeContainer() {
/*  195 */     return new CmisTypeContainer();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetTypeDefinition createGetTypeDefinition() {
/*  203 */     return new GetTypeDefinition();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetTypeDefinitionResponse createGetTypeDefinitionResponse() {
/*  211 */     return new GetTypeDefinitionResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CmisTypeDefinitionType createCmisTypeDefinitionType() {
/*  219 */     return new CmisTypeDefinitionType();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CreateType createCreateType() {
/*  227 */     return new CreateType();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CreateTypeResponse createCreateTypeResponse() {
/*  235 */     return new CreateTypeResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public UpdateType createUpdateType() {
/*  243 */     return new UpdateType();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public UpdateTypeResponse createUpdateTypeResponse() {
/*  251 */     return new UpdateTypeResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public DeleteType createDeleteType() {
/*  259 */     return new DeleteType();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public DeleteTypeResponse createDeleteTypeResponse() {
/*  267 */     return new DeleteTypeResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetDescendants createGetDescendants() {
/*  275 */     return new GetDescendants();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetDescendantsResponse createGetDescendantsResponse() {
/*  283 */     return new GetDescendantsResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CmisObjectInFolderContainerType createCmisObjectInFolderContainerType() {
/*  291 */     return new CmisObjectInFolderContainerType();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetFolderTree createGetFolderTree() {
/*  299 */     return new GetFolderTree();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetFolderTreeResponse createGetFolderTreeResponse() {
/*  307 */     return new GetFolderTreeResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetChildren createGetChildren() {
/*  315 */     return new GetChildren();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetChildrenResponse createGetChildrenResponse() {
/*  323 */     return new GetChildrenResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CmisObjectInFolderListType createCmisObjectInFolderListType() {
/*  331 */     return new CmisObjectInFolderListType();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetFolderParent createGetFolderParent() {
/*  339 */     return new GetFolderParent();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetFolderParentResponse createGetFolderParentResponse() {
/*  347 */     return new GetFolderParentResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CmisObjectType createCmisObjectType() {
/*  355 */     return new CmisObjectType();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetObjectParents createGetObjectParents() {
/*  363 */     return new GetObjectParents();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetObjectParentsResponse createGetObjectParentsResponse() {
/*  371 */     return new GetObjectParentsResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CmisObjectParentsType createCmisObjectParentsType() {
/*  379 */     return new CmisObjectParentsType();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetRenditions createGetRenditions() {
/*  387 */     return new GetRenditions();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetRenditionsResponse createGetRenditionsResponse() {
/*  395 */     return new GetRenditionsResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CmisRenditionType createCmisRenditionType() {
/*  403 */     return new CmisRenditionType();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetCheckedOutDocs createGetCheckedOutDocs() {
/*  411 */     return new GetCheckedOutDocs();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetCheckedOutDocsResponse createGetCheckedOutDocsResponse() {
/*  419 */     return new GetCheckedOutDocsResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CmisObjectListType createCmisObjectListType() {
/*  427 */     return new CmisObjectListType();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CreateDocument createCreateDocument() {
/*  435 */     return new CreateDocument();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CmisPropertiesType createCmisPropertiesType() {
/*  443 */     return new CmisPropertiesType();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CmisContentStreamType createCmisContentStreamType() {
/*  451 */     return new CmisContentStreamType();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CmisAccessControlListType createCmisAccessControlListType() {
/*  459 */     return new CmisAccessControlListType();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CreateDocumentResponse createCreateDocumentResponse() {
/*  467 */     return new CreateDocumentResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CreateDocumentFromSource createCreateDocumentFromSource() {
/*  475 */     return new CreateDocumentFromSource();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CreateDocumentFromSourceResponse createCreateDocumentFromSourceResponse() {
/*  483 */     return new CreateDocumentFromSourceResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CreateFolder createCreateFolder() {
/*  491 */     return new CreateFolder();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CreateFolderResponse createCreateFolderResponse() {
/*  499 */     return new CreateFolderResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CreateRelationship createCreateRelationship() {
/*  507 */     return new CreateRelationship();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CreateRelationshipResponse createCreateRelationshipResponse() {
/*  515 */     return new CreateRelationshipResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CreatePolicy createCreatePolicy() {
/*  523 */     return new CreatePolicy();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CreatePolicyResponse createCreatePolicyResponse() {
/*  531 */     return new CreatePolicyResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CreateItem createCreateItem() {
/*  539 */     return new CreateItem();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CreateItemResponse createCreateItemResponse() {
/*  547 */     return new CreateItemResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetAllowableActions createGetAllowableActions() {
/*  555 */     return new GetAllowableActions();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetAllowableActionsResponse createGetAllowableActionsResponse() {
/*  563 */     return new GetAllowableActionsResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CmisAllowableActionsType createCmisAllowableActionsType() {
/*  571 */     return new CmisAllowableActionsType();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetProperties createGetProperties() {
/*  579 */     return new GetProperties();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetPropertiesResponse createGetPropertiesResponse() {
/*  587 */     return new GetPropertiesResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetObject createGetObject() {
/*  595 */     return new GetObject();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetObjectResponse createGetObjectResponse() {
/*  603 */     return new GetObjectResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetObjectByPath createGetObjectByPath() {
/*  611 */     return new GetObjectByPath();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetObjectByPathResponse createGetObjectByPathResponse() {
/*  619 */     return new GetObjectByPathResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetContentStream createGetContentStream() {
/*  627 */     return new GetContentStream();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetContentStreamResponse createGetContentStreamResponse() {
/*  635 */     return new GetContentStreamResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public UpdateProperties createUpdateProperties() {
/*  643 */     return new UpdateProperties();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public UpdatePropertiesResponse createUpdatePropertiesResponse() {
/*  651 */     return new UpdatePropertiesResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public BulkUpdateProperties createBulkUpdateProperties() {
/*  659 */     return new BulkUpdateProperties();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CmisBulkUpdateType createCmisBulkUpdateType() {
/*  667 */     return new CmisBulkUpdateType();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public BulkUpdatePropertiesResponse createBulkUpdatePropertiesResponse() {
/*  675 */     return new BulkUpdatePropertiesResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CmisObjectIdAndChangeTokenType createCmisObjectIdAndChangeTokenType() {
/*  683 */     return new CmisObjectIdAndChangeTokenType();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public MoveObject createMoveObject() {
/*  691 */     return new MoveObject();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public MoveObjectResponse createMoveObjectResponse() {
/*  699 */     return new MoveObjectResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public DeleteObject createDeleteObject() {
/*  707 */     return new DeleteObject();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public DeleteObjectResponse createDeleteObjectResponse() {
/*  715 */     return new DeleteObjectResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public DeleteTree createDeleteTree() {
/*  723 */     return new DeleteTree();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public DeleteTreeResponse.FailedToDelete createDeleteTreeResponseFailedToDelete() {
/*  731 */     return new DeleteTreeResponse.FailedToDelete();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public SetContentStream createSetContentStream() {
/*  739 */     return new SetContentStream();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public SetContentStreamResponse createSetContentStreamResponse() {
/*  747 */     return new SetContentStreamResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public AppendContentStream createAppendContentStream() {
/*  755 */     return new AppendContentStream();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public AppendContentStreamResponse createAppendContentStreamResponse() {
/*  763 */     return new AppendContentStreamResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public DeleteContentStream createDeleteContentStream() {
/*  771 */     return new DeleteContentStream();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public DeleteContentStreamResponse createDeleteContentStreamResponse() {
/*  779 */     return new DeleteContentStreamResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public AddObjectToFolder createAddObjectToFolder() {
/*  787 */     return new AddObjectToFolder();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public AddObjectToFolderResponse createAddObjectToFolderResponse() {
/*  795 */     return new AddObjectToFolderResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public RemoveObjectFromFolder createRemoveObjectFromFolder() {
/*  803 */     return new RemoveObjectFromFolder();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public RemoveObjectFromFolderResponse createRemoveObjectFromFolderResponse() {
/*  811 */     return new RemoveObjectFromFolderResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Query createQuery() {
/*  819 */     return new Query();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public QueryResponse createQueryResponse() {
/*  827 */     return new QueryResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetContentChanges createGetContentChanges() {
/*  835 */     return new GetContentChanges();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetContentChangesResponse createGetContentChangesResponse() {
/*  843 */     return new GetContentChangesResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CheckOut createCheckOut() {
/*  851 */     return new CheckOut();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CheckOutResponse createCheckOutResponse() {
/*  859 */     return new CheckOutResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CancelCheckOut createCancelCheckOut() {
/*  867 */     return new CancelCheckOut();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CancelCheckOutResponse createCancelCheckOutResponse() {
/*  875 */     return new CancelCheckOutResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CheckIn createCheckIn() {
/*  883 */     return new CheckIn();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CheckInResponse createCheckInResponse() {
/*  891 */     return new CheckInResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetPropertiesOfLatestVersion createGetPropertiesOfLatestVersion() {
/*  899 */     return new GetPropertiesOfLatestVersion();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetPropertiesOfLatestVersionResponse createGetPropertiesOfLatestVersionResponse() {
/*  907 */     return new GetPropertiesOfLatestVersionResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetObjectOfLatestVersion createGetObjectOfLatestVersion() {
/*  915 */     return new GetObjectOfLatestVersion();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetObjectOfLatestVersionResponse createGetObjectOfLatestVersionResponse() {
/*  923 */     return new GetObjectOfLatestVersionResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetAllVersions createGetAllVersions() {
/*  931 */     return new GetAllVersions();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetAllVersionsResponse createGetAllVersionsResponse() {
/*  939 */     return new GetAllVersionsResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetObjectRelationships createGetObjectRelationships() {
/*  947 */     return new GetObjectRelationships();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetObjectRelationshipsResponse createGetObjectRelationshipsResponse() {
/*  955 */     return new GetObjectRelationshipsResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ApplyPolicy createApplyPolicy() {
/*  963 */     return new ApplyPolicy();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ApplyPolicyResponse createApplyPolicyResponse() {
/*  971 */     return new ApplyPolicyResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public RemovePolicy createRemovePolicy() {
/*  979 */     return new RemovePolicy();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public RemovePolicyResponse createRemovePolicyResponse() {
/*  987 */     return new RemovePolicyResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetAppliedPolicies createGetAppliedPolicies() {
/*  995 */     return new GetAppliedPolicies();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetAppliedPoliciesResponse createGetAppliedPoliciesResponse() {
/* 1003 */     return new GetAppliedPoliciesResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetACL createGetACL() {
/* 1011 */     return new GetACL();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public GetACLResponse createGetACLResponse() {
/* 1019 */     return new GetACLResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CmisACLType createCmisACLType() {
/* 1027 */     return new CmisACLType();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ApplyACL createApplyACL() {
/* 1035 */     return new ApplyACL();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ApplyACLResponse createApplyACLResponse() {
/* 1043 */     return new ApplyACLResponse();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CmisObjectInFolderType createCmisObjectInFolderType() {
/* 1051 */     return new CmisObjectInFolderType();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CmisQueryType createCmisQueryType() {
/* 1059 */     return new CmisQueryType();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CmisProperty createCmisProperty() {
/* 1067 */     return new CmisProperty();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CmisPropertyBoolean createCmisPropertyBoolean() {
/* 1075 */     return new CmisPropertyBoolean();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CmisPropertyId createCmisPropertyId() {
/* 1083 */     return new CmisPropertyId();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CmisPropertyInteger createCmisPropertyInteger() {
/* 1091 */     return new CmisPropertyInteger();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CmisPropertyDateTime createCmisPropertyDateTime() {
/* 1099 */     return new CmisPropertyDateTime();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CmisPropertyDecimal createCmisPropertyDecimal() {
/* 1107 */     return new CmisPropertyDecimal();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CmisPropertyHtml createCmisPropertyHtml() {
/* 1115 */     return new CmisPropertyHtml();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CmisPropertyString createCmisPropertyString() {
/* 1123 */     return new CmisPropertyString();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CmisPropertyUri createCmisPropertyUri() {
/* 1131 */     return new CmisPropertyUri();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CmisChoice createCmisChoice() {
/* 1139 */     return new CmisChoice();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CmisChoiceBoolean createCmisChoiceBoolean() {
/* 1147 */     return new CmisChoiceBoolean();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CmisChoiceId createCmisChoiceId() {
/* 1155 */     return new CmisChoiceId();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CmisChoiceInteger createCmisChoiceInteger() {
/* 1163 */     return new CmisChoiceInteger();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CmisChoiceDateTime createCmisChoiceDateTime() {
/* 1171 */     return new CmisChoiceDateTime();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CmisChoiceDecimal createCmisChoiceDecimal() {
/* 1179 */     return new CmisChoiceDecimal();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CmisChoiceHtml createCmisChoiceHtml() {
/* 1187 */     return new CmisChoiceHtml();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CmisChoiceString createCmisChoiceString() {
/* 1195 */     return new CmisChoiceString();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CmisChoiceUri createCmisChoiceUri() {
/* 1203 */     return new CmisChoiceUri();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CmisListOfIdsType createCmisListOfIdsType() {
/* 1211 */     return new CmisListOfIdsType();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CmisPropertyDefinitionType createCmisPropertyDefinitionType() {
/* 1219 */     return new CmisPropertyDefinitionType();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CmisPropertyBooleanDefinitionType createCmisPropertyBooleanDefinitionType() {
/* 1227 */     return new CmisPropertyBooleanDefinitionType();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CmisPropertyIdDefinitionType createCmisPropertyIdDefinitionType() {
/* 1235 */     return new CmisPropertyIdDefinitionType();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CmisPropertyIntegerDefinitionType createCmisPropertyIntegerDefinitionType() {
/* 1243 */     return new CmisPropertyIntegerDefinitionType();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CmisPropertyDateTimeDefinitionType createCmisPropertyDateTimeDefinitionType() {
/* 1251 */     return new CmisPropertyDateTimeDefinitionType();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CmisPropertyDecimalDefinitionType createCmisPropertyDecimalDefinitionType() {
/* 1259 */     return new CmisPropertyDecimalDefinitionType();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CmisPropertyHtmlDefinitionType createCmisPropertyHtmlDefinitionType() {
/* 1267 */     return new CmisPropertyHtmlDefinitionType();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CmisPropertyStringDefinitionType createCmisPropertyStringDefinitionType() {
/* 1275 */     return new CmisPropertyStringDefinitionType();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CmisPropertyUriDefinitionType createCmisPropertyUriDefinitionType() {
/* 1283 */     return new CmisPropertyUriDefinitionType();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CmisTypeDocumentDefinitionType createCmisTypeDocumentDefinitionType() {
/* 1291 */     return new CmisTypeDocumentDefinitionType();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CmisTypeFolderDefinitionType createCmisTypeFolderDefinitionType() {
/* 1299 */     return new CmisTypeFolderDefinitionType();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CmisTypeRelationshipDefinitionType createCmisTypeRelationshipDefinitionType() {
/* 1307 */     return new CmisTypeRelationshipDefinitionType();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CmisTypePolicyDefinitionType createCmisTypePolicyDefinitionType() {
/* 1315 */     return new CmisTypePolicyDefinitionType();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CmisTypeItemDefinitionType createCmisTypeItemDefinitionType() {
/* 1323 */     return new CmisTypeItemDefinitionType();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CmisTypeSecondaryDefinitionType createCmisTypeSecondaryDefinitionType() {
/* 1331 */     return new CmisTypeSecondaryDefinitionType();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CmisRepositoryCapabilitiesType createCmisRepositoryCapabilitiesType() {
/* 1339 */     return new CmisRepositoryCapabilitiesType();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CmisChangeEventType createCmisChangeEventType() {
/* 1347 */     return new CmisChangeEventType();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CmisPermissionDefinition createCmisPermissionDefinition() {
/* 1355 */     return new CmisPermissionDefinition();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CmisPermissionMapping createCmisPermissionMapping() {
/* 1363 */     return new CmisPermissionMapping();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CmisAccessControlPrincipalType createCmisAccessControlPrincipalType() {
/* 1371 */     return new CmisAccessControlPrincipalType();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CmisAccessControlEntryType createCmisAccessControlEntryType() {
/* 1379 */     return new CmisAccessControlEntryType();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CmisACLCapabilityType createCmisACLCapabilityType() {
/* 1387 */     return new CmisACLCapabilityType();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CmisTypeMutabilityCapabilitiesType createCmisTypeMutabilityCapabilitiesType() {
/* 1395 */     return new CmisTypeMutabilityCapabilitiesType();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CmisCreatablePropertyTypesType createCmisCreatablePropertyTypesType() {
/* 1403 */     return new CmisCreatablePropertyTypesType();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CmisNewTypeSettableAttributes createCmisNewTypeSettableAttributes() {
/* 1411 */     return new CmisNewTypeSettableAttributes();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CmisExtensionFeatureKeyValuePair createCmisExtensionFeatureKeyValuePair() {
/* 1419 */     return new CmisExtensionFeatureKeyValuePair();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CmisExtensionFeatureType createCmisExtensionFeatureType() {
/* 1427 */     return new CmisExtensionFeatureType();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "cmisFault")
/*      */   public JAXBElement<CmisFaultType> createCmisFault(CmisFaultType value) {
/* 1436 */     return new JAXBElement<>(_CmisFault_QNAME, CmisFaultType.class, null, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/core/200908/", name = "allowableActions")
/*      */   public JAXBElement<CmisAllowableActionsType> createAllowableActions(CmisAllowableActionsType value) {
/* 1445 */     return new JAXBElement<>(_AllowableActions_QNAME, CmisAllowableActionsType.class, null, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/core/200908/", name = "query")
/*      */   public JAXBElement<CmisQueryType> createQuery(CmisQueryType value) {
/* 1454 */     return new JAXBElement<>(_Query_QNAME, CmisQueryType.class, null, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/core/200908/", name = "acl")
/*      */   public JAXBElement<CmisAccessControlListType> createAcl(CmisAccessControlListType value) {
/* 1463 */     return new JAXBElement<>(_Acl_QNAME, CmisAccessControlListType.class, null, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "extension", scope = GetRepositories.class)
/*      */   public JAXBElement<CmisExtensionType> createGetRepositoriesExtension(CmisExtensionType value) {
/* 1472 */     return new JAXBElement<>(_GetRepositoriesExtension_QNAME, CmisExtensionType.class, GetRepositories.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "extension", scope = GetRepositoryInfo.class)
/*      */   public JAXBElement<CmisExtensionType> createGetRepositoryInfoExtension(CmisExtensionType value) {
/* 1481 */     return new JAXBElement<>(_GetRepositoriesExtension_QNAME, CmisExtensionType.class, GetRepositoryInfo.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "typeId", scope = GetTypeChildren.class)
/*      */   public JAXBElement<String> createGetTypeChildrenTypeId(String value) {
/* 1490 */     return new JAXBElement<>(_GetTypeChildrenTypeId_QNAME, String.class, GetTypeChildren.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "includePropertyDefinitions", scope = GetTypeChildren.class)
/*      */   public JAXBElement<Boolean> createGetTypeChildrenIncludePropertyDefinitions(Boolean value) {
/* 1499 */     return new JAXBElement<>(_GetTypeChildrenIncludePropertyDefinitions_QNAME, Boolean.class, GetTypeChildren.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "maxItems", scope = GetTypeChildren.class)
/*      */   public JAXBElement<BigInteger> createGetTypeChildrenMaxItems(BigInteger value) {
/* 1508 */     return new JAXBElement<>(_GetTypeChildrenMaxItems_QNAME, BigInteger.class, GetTypeChildren.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "skipCount", scope = GetTypeChildren.class)
/*      */   public JAXBElement<BigInteger> createGetTypeChildrenSkipCount(BigInteger value) {
/* 1517 */     return new JAXBElement<>(_GetTypeChildrenSkipCount_QNAME, BigInteger.class, GetTypeChildren.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "extension", scope = GetTypeChildren.class)
/*      */   public JAXBElement<CmisExtensionType> createGetTypeChildrenExtension(CmisExtensionType value) {
/* 1526 */     return new JAXBElement<>(_GetRepositoriesExtension_QNAME, CmisExtensionType.class, GetTypeChildren.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "typeId", scope = GetTypeDescendants.class)
/*      */   public JAXBElement<String> createGetTypeDescendantsTypeId(String value) {
/* 1535 */     return new JAXBElement<>(_GetTypeChildrenTypeId_QNAME, String.class, GetTypeDescendants.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "depth", scope = GetTypeDescendants.class)
/*      */   public JAXBElement<BigInteger> createGetTypeDescendantsDepth(BigInteger value) {
/* 1544 */     return new JAXBElement<>(_GetTypeDescendantsDepth_QNAME, BigInteger.class, GetTypeDescendants.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "includePropertyDefinitions", scope = GetTypeDescendants.class)
/*      */   public JAXBElement<Boolean> createGetTypeDescendantsIncludePropertyDefinitions(Boolean value) {
/* 1553 */     return new JAXBElement<>(_GetTypeChildrenIncludePropertyDefinitions_QNAME, Boolean.class, GetTypeDescendants.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "extension", scope = GetTypeDescendants.class)
/*      */   public JAXBElement<CmisExtensionType> createGetTypeDescendantsExtension(CmisExtensionType value) {
/* 1562 */     return new JAXBElement<>(_GetRepositoriesExtension_QNAME, CmisExtensionType.class, GetTypeDescendants.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "extension", scope = GetTypeDefinition.class)
/*      */   public JAXBElement<CmisExtensionType> createGetTypeDefinitionExtension(CmisExtensionType value) {
/* 1571 */     return new JAXBElement<>(_GetRepositoriesExtension_QNAME, CmisExtensionType.class, GetTypeDefinition.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "extension", scope = CreateType.class)
/*      */   public JAXBElement<CmisExtensionType> createCreateTypeExtension(CmisExtensionType value) {
/* 1580 */     return new JAXBElement<>(_GetRepositoriesExtension_QNAME, CmisExtensionType.class, CreateType.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "extension", scope = UpdateType.class)
/*      */   public JAXBElement<CmisExtensionType> createUpdateTypeExtension(CmisExtensionType value) {
/* 1589 */     return new JAXBElement<>(_GetRepositoriesExtension_QNAME, CmisExtensionType.class, UpdateType.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "extension", scope = DeleteType.class)
/*      */   public JAXBElement<CmisExtensionType> createDeleteTypeExtension(CmisExtensionType value) {
/* 1598 */     return new JAXBElement<>(_GetRepositoriesExtension_QNAME, CmisExtensionType.class, DeleteType.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "extension", scope = DeleteTypeResponse.class)
/*      */   public JAXBElement<CmisExtensionType> createDeleteTypeResponseExtension(CmisExtensionType value) {
/* 1607 */     return new JAXBElement<>(_GetRepositoriesExtension_QNAME, CmisExtensionType.class, DeleteTypeResponse.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "depth", scope = GetDescendants.class)
/*      */   public JAXBElement<BigInteger> createGetDescendantsDepth(BigInteger value) {
/* 1616 */     return new JAXBElement<>(_GetTypeDescendantsDepth_QNAME, BigInteger.class, GetDescendants.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "filter", scope = GetDescendants.class)
/*      */   public JAXBElement<String> createGetDescendantsFilter(String value) {
/* 1625 */     return new JAXBElement<>(_GetDescendantsFilter_QNAME, String.class, GetDescendants.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "includeAllowableActions", scope = GetDescendants.class)
/*      */   public JAXBElement<Boolean> createGetDescendantsIncludeAllowableActions(Boolean value) {
/* 1634 */     return new JAXBElement<>(_GetDescendantsIncludeAllowableActions_QNAME, Boolean.class, GetDescendants.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "includeRelationships", scope = GetDescendants.class)
/*      */   public JAXBElement<EnumIncludeRelationships> createGetDescendantsIncludeRelationships(EnumIncludeRelationships value) {
/* 1643 */     return new JAXBElement<>(_GetDescendantsIncludeRelationships_QNAME, EnumIncludeRelationships.class, GetDescendants.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "renditionFilter", scope = GetDescendants.class)
/*      */   public JAXBElement<String> createGetDescendantsRenditionFilter(String value) {
/* 1652 */     return new JAXBElement<>(_GetDescendantsRenditionFilter_QNAME, String.class, GetDescendants.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "includePathSegment", scope = GetDescendants.class)
/*      */   public JAXBElement<Boolean> createGetDescendantsIncludePathSegment(Boolean value) {
/* 1661 */     return new JAXBElement<>(_GetDescendantsIncludePathSegment_QNAME, Boolean.class, GetDescendants.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "extension", scope = GetDescendants.class)
/*      */   public JAXBElement<CmisExtensionType> createGetDescendantsExtension(CmisExtensionType value) {
/* 1670 */     return new JAXBElement<>(_GetRepositoriesExtension_QNAME, CmisExtensionType.class, GetDescendants.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "depth", scope = GetFolderTree.class)
/*      */   public JAXBElement<BigInteger> createGetFolderTreeDepth(BigInteger value) {
/* 1679 */     return new JAXBElement<>(_GetTypeDescendantsDepth_QNAME, BigInteger.class, GetFolderTree.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "filter", scope = GetFolderTree.class)
/*      */   public JAXBElement<String> createGetFolderTreeFilter(String value) {
/* 1688 */     return new JAXBElement<>(_GetDescendantsFilter_QNAME, String.class, GetFolderTree.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "includeAllowableActions", scope = GetFolderTree.class)
/*      */   public JAXBElement<Boolean> createGetFolderTreeIncludeAllowableActions(Boolean value) {
/* 1697 */     return new JAXBElement<>(_GetDescendantsIncludeAllowableActions_QNAME, Boolean.class, GetFolderTree.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "includeRelationships", scope = GetFolderTree.class)
/*      */   public JAXBElement<EnumIncludeRelationships> createGetFolderTreeIncludeRelationships(EnumIncludeRelationships value) {
/* 1706 */     return new JAXBElement<>(_GetDescendantsIncludeRelationships_QNAME, EnumIncludeRelationships.class, GetFolderTree.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "renditionFilter", scope = GetFolderTree.class)
/*      */   public JAXBElement<String> createGetFolderTreeRenditionFilter(String value) {
/* 1715 */     return new JAXBElement<>(_GetDescendantsRenditionFilter_QNAME, String.class, GetFolderTree.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "includePathSegment", scope = GetFolderTree.class)
/*      */   public JAXBElement<Boolean> createGetFolderTreeIncludePathSegment(Boolean value) {
/* 1724 */     return new JAXBElement<>(_GetDescendantsIncludePathSegment_QNAME, Boolean.class, GetFolderTree.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "extension", scope = GetFolderTree.class)
/*      */   public JAXBElement<CmisExtensionType> createGetFolderTreeExtension(CmisExtensionType value) {
/* 1733 */     return new JAXBElement<>(_GetRepositoriesExtension_QNAME, CmisExtensionType.class, GetFolderTree.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "filter", scope = GetChildren.class)
/*      */   public JAXBElement<String> createGetChildrenFilter(String value) {
/* 1742 */     return new JAXBElement<>(_GetDescendantsFilter_QNAME, String.class, GetChildren.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "orderBy", scope = GetChildren.class)
/*      */   public JAXBElement<String> createGetChildrenOrderBy(String value) {
/* 1751 */     return new JAXBElement<>(_GetChildrenOrderBy_QNAME, String.class, GetChildren.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "includeAllowableActions", scope = GetChildren.class)
/*      */   public JAXBElement<Boolean> createGetChildrenIncludeAllowableActions(Boolean value) {
/* 1760 */     return new JAXBElement<>(_GetDescendantsIncludeAllowableActions_QNAME, Boolean.class, GetChildren.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "includeRelationships", scope = GetChildren.class)
/*      */   public JAXBElement<EnumIncludeRelationships> createGetChildrenIncludeRelationships(EnumIncludeRelationships value) {
/* 1769 */     return new JAXBElement<>(_GetDescendantsIncludeRelationships_QNAME, EnumIncludeRelationships.class, GetChildren.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "renditionFilter", scope = GetChildren.class)
/*      */   public JAXBElement<String> createGetChildrenRenditionFilter(String value) {
/* 1778 */     return new JAXBElement<>(_GetDescendantsRenditionFilter_QNAME, String.class, GetChildren.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "includePathSegment", scope = GetChildren.class)
/*      */   public JAXBElement<Boolean> createGetChildrenIncludePathSegment(Boolean value) {
/* 1787 */     return new JAXBElement<>(_GetDescendantsIncludePathSegment_QNAME, Boolean.class, GetChildren.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "maxItems", scope = GetChildren.class)
/*      */   public JAXBElement<BigInteger> createGetChildrenMaxItems(BigInteger value) {
/* 1796 */     return new JAXBElement<>(_GetTypeChildrenMaxItems_QNAME, BigInteger.class, GetChildren.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "skipCount", scope = GetChildren.class)
/*      */   public JAXBElement<BigInteger> createGetChildrenSkipCount(BigInteger value) {
/* 1805 */     return new JAXBElement<>(_GetTypeChildrenSkipCount_QNAME, BigInteger.class, GetChildren.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "extension", scope = GetChildren.class)
/*      */   public JAXBElement<CmisExtensionType> createGetChildrenExtension(CmisExtensionType value) {
/* 1814 */     return new JAXBElement<>(_GetRepositoriesExtension_QNAME, CmisExtensionType.class, GetChildren.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "extension", scope = GetFolderParent.class)
/*      */   public JAXBElement<CmisExtensionType> createGetFolderParentExtension(CmisExtensionType value) {
/* 1823 */     return new JAXBElement<>(_GetRepositoriesExtension_QNAME, CmisExtensionType.class, GetFolderParent.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "filter", scope = GetObjectParents.class)
/*      */   public JAXBElement<String> createGetObjectParentsFilter(String value) {
/* 1832 */     return new JAXBElement<>(_GetDescendantsFilter_QNAME, String.class, GetObjectParents.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "includeAllowableActions", scope = GetObjectParents.class)
/*      */   public JAXBElement<Boolean> createGetObjectParentsIncludeAllowableActions(Boolean value) {
/* 1841 */     return new JAXBElement<>(_GetDescendantsIncludeAllowableActions_QNAME, Boolean.class, GetObjectParents.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "includeRelationships", scope = GetObjectParents.class)
/*      */   public JAXBElement<EnumIncludeRelationships> createGetObjectParentsIncludeRelationships(EnumIncludeRelationships value) {
/* 1850 */     return new JAXBElement<>(_GetDescendantsIncludeRelationships_QNAME, EnumIncludeRelationships.class, GetObjectParents.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "renditionFilter", scope = GetObjectParents.class)
/*      */   public JAXBElement<String> createGetObjectParentsRenditionFilter(String value) {
/* 1859 */     return new JAXBElement<>(_GetDescendantsRenditionFilter_QNAME, String.class, GetObjectParents.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "includeRelativePathSegment", scope = GetObjectParents.class)
/*      */   public JAXBElement<Boolean> createGetObjectParentsIncludeRelativePathSegment(Boolean value) {
/* 1868 */     return new JAXBElement<>(_GetObjectParentsIncludeRelativePathSegment_QNAME, Boolean.class, GetObjectParents.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "extension", scope = GetObjectParents.class)
/*      */   public JAXBElement<CmisExtensionType> createGetObjectParentsExtension(CmisExtensionType value) {
/* 1877 */     return new JAXBElement<>(_GetRepositoriesExtension_QNAME, CmisExtensionType.class, GetObjectParents.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "renditionFilter", scope = GetRenditions.class)
/*      */   public JAXBElement<String> createGetRenditionsRenditionFilter(String value) {
/* 1886 */     return new JAXBElement<>(_GetDescendantsRenditionFilter_QNAME, String.class, GetRenditions.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "maxItems", scope = GetRenditions.class)
/*      */   public JAXBElement<BigInteger> createGetRenditionsMaxItems(BigInteger value) {
/* 1895 */     return new JAXBElement<>(_GetTypeChildrenMaxItems_QNAME, BigInteger.class, GetRenditions.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "skipCount", scope = GetRenditions.class)
/*      */   public JAXBElement<BigInteger> createGetRenditionsSkipCount(BigInteger value) {
/* 1904 */     return new JAXBElement<>(_GetTypeChildrenSkipCount_QNAME, BigInteger.class, GetRenditions.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "extension", scope = GetRenditions.class)
/*      */   public JAXBElement<CmisExtensionType> createGetRenditionsExtension(CmisExtensionType value) {
/* 1913 */     return new JAXBElement<>(_GetRepositoriesExtension_QNAME, CmisExtensionType.class, GetRenditions.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "folderId", scope = GetCheckedOutDocs.class)
/*      */   public JAXBElement<String> createGetCheckedOutDocsFolderId(String value) {
/* 1922 */     return new JAXBElement<>(_GetCheckedOutDocsFolderId_QNAME, String.class, GetCheckedOutDocs.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "filter", scope = GetCheckedOutDocs.class)
/*      */   public JAXBElement<String> createGetCheckedOutDocsFilter(String value) {
/* 1931 */     return new JAXBElement<>(_GetDescendantsFilter_QNAME, String.class, GetCheckedOutDocs.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "orderBy", scope = GetCheckedOutDocs.class)
/*      */   public JAXBElement<String> createGetCheckedOutDocsOrderBy(String value) {
/* 1940 */     return new JAXBElement<>(_GetChildrenOrderBy_QNAME, String.class, GetCheckedOutDocs.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "includeAllowableActions", scope = GetCheckedOutDocs.class)
/*      */   public JAXBElement<Boolean> createGetCheckedOutDocsIncludeAllowableActions(Boolean value) {
/* 1949 */     return new JAXBElement<>(_GetDescendantsIncludeAllowableActions_QNAME, Boolean.class, GetCheckedOutDocs.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "includeRelationships", scope = GetCheckedOutDocs.class)
/*      */   public JAXBElement<EnumIncludeRelationships> createGetCheckedOutDocsIncludeRelationships(EnumIncludeRelationships value) {
/* 1958 */     return new JAXBElement<>(_GetDescendantsIncludeRelationships_QNAME, EnumIncludeRelationships.class, GetCheckedOutDocs.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "renditionFilter", scope = GetCheckedOutDocs.class)
/*      */   public JAXBElement<String> createGetCheckedOutDocsRenditionFilter(String value) {
/* 1967 */     return new JAXBElement<>(_GetDescendantsRenditionFilter_QNAME, String.class, GetCheckedOutDocs.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "maxItems", scope = GetCheckedOutDocs.class)
/*      */   public JAXBElement<BigInteger> createGetCheckedOutDocsMaxItems(BigInteger value) {
/* 1976 */     return new JAXBElement<>(_GetTypeChildrenMaxItems_QNAME, BigInteger.class, GetCheckedOutDocs.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "skipCount", scope = GetCheckedOutDocs.class)
/*      */   public JAXBElement<BigInteger> createGetCheckedOutDocsSkipCount(BigInteger value) {
/* 1985 */     return new JAXBElement<>(_GetTypeChildrenSkipCount_QNAME, BigInteger.class, GetCheckedOutDocs.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "extension", scope = GetCheckedOutDocs.class)
/*      */   public JAXBElement<CmisExtensionType> createGetCheckedOutDocsExtension(CmisExtensionType value) {
/* 1994 */     return new JAXBElement<>(_GetRepositoriesExtension_QNAME, CmisExtensionType.class, GetCheckedOutDocs.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "folderId", scope = CreateDocument.class)
/*      */   public JAXBElement<String> createCreateDocumentFolderId(String value) {
/* 2003 */     return new JAXBElement<>(_GetCheckedOutDocsFolderId_QNAME, String.class, CreateDocument.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "contentStream", scope = CreateDocument.class)
/*      */   public JAXBElement<CmisContentStreamType> createCreateDocumentContentStream(CmisContentStreamType value) {
/* 2012 */     return new JAXBElement<>(_CreateDocumentContentStream_QNAME, CmisContentStreamType.class, CreateDocument.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "versioningState", scope = CreateDocument.class)
/*      */   public JAXBElement<EnumVersioningState> createCreateDocumentVersioningState(EnumVersioningState value) {
/* 2021 */     return new JAXBElement<>(_CreateDocumentVersioningState_QNAME, EnumVersioningState.class, CreateDocument.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "addACEs", scope = CreateDocument.class)
/*      */   public JAXBElement<CmisAccessControlListType> createCreateDocumentAddACEs(CmisAccessControlListType value) {
/* 2030 */     return new JAXBElement<>(_CreateDocumentAddACEs_QNAME, CmisAccessControlListType.class, CreateDocument.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "removeACEs", scope = CreateDocument.class)
/*      */   public JAXBElement<CmisAccessControlListType> createCreateDocumentRemoveACEs(CmisAccessControlListType value) {
/* 2039 */     return new JAXBElement<>(_CreateDocumentRemoveACEs_QNAME, CmisAccessControlListType.class, CreateDocument.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "extension", scope = CreateDocument.class)
/*      */   public JAXBElement<CmisExtensionType> createCreateDocumentExtension(CmisExtensionType value) {
/* 2048 */     return new JAXBElement<>(_GetRepositoriesExtension_QNAME, CmisExtensionType.class, CreateDocument.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "extension", scope = CreateDocumentResponse.class)
/*      */   public JAXBElement<CmisExtensionType> createCreateDocumentResponseExtension(CmisExtensionType value) {
/* 2057 */     return new JAXBElement<>(_GetRepositoriesExtension_QNAME, CmisExtensionType.class, CreateDocumentResponse.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "folderId", scope = CreateDocumentFromSource.class)
/*      */   public JAXBElement<String> createCreateDocumentFromSourceFolderId(String value) {
/* 2066 */     return new JAXBElement<>(_GetCheckedOutDocsFolderId_QNAME, String.class, CreateDocumentFromSource.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "versioningState", scope = CreateDocumentFromSource.class)
/*      */   public JAXBElement<EnumVersioningState> createCreateDocumentFromSourceVersioningState(EnumVersioningState value) {
/* 2075 */     return new JAXBElement<>(_CreateDocumentVersioningState_QNAME, EnumVersioningState.class, CreateDocumentFromSource.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "addACEs", scope = CreateDocumentFromSource.class)
/*      */   public JAXBElement<CmisAccessControlListType> createCreateDocumentFromSourceAddACEs(CmisAccessControlListType value) {
/* 2084 */     return new JAXBElement<>(_CreateDocumentAddACEs_QNAME, CmisAccessControlListType.class, CreateDocumentFromSource.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "removeACEs", scope = CreateDocumentFromSource.class)
/*      */   public JAXBElement<CmisAccessControlListType> createCreateDocumentFromSourceRemoveACEs(CmisAccessControlListType value) {
/* 2093 */     return new JAXBElement<>(_CreateDocumentRemoveACEs_QNAME, CmisAccessControlListType.class, CreateDocumentFromSource.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "extension", scope = CreateDocumentFromSource.class)
/*      */   public JAXBElement<CmisExtensionType> createCreateDocumentFromSourceExtension(CmisExtensionType value) {
/* 2102 */     return new JAXBElement<>(_GetRepositoriesExtension_QNAME, CmisExtensionType.class, CreateDocumentFromSource.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "extension", scope = CreateDocumentFromSourceResponse.class)
/*      */   public JAXBElement<CmisExtensionType> createCreateDocumentFromSourceResponseExtension(CmisExtensionType value) {
/* 2111 */     return new JAXBElement<>(_GetRepositoriesExtension_QNAME, CmisExtensionType.class, CreateDocumentFromSourceResponse.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "addACEs", scope = CreateFolder.class)
/*      */   public JAXBElement<CmisAccessControlListType> createCreateFolderAddACEs(CmisAccessControlListType value) {
/* 2120 */     return new JAXBElement<>(_CreateDocumentAddACEs_QNAME, CmisAccessControlListType.class, CreateFolder.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "removeACEs", scope = CreateFolder.class)
/*      */   public JAXBElement<CmisAccessControlListType> createCreateFolderRemoveACEs(CmisAccessControlListType value) {
/* 2129 */     return new JAXBElement<>(_CreateDocumentRemoveACEs_QNAME, CmisAccessControlListType.class, CreateFolder.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "extension", scope = CreateFolder.class)
/*      */   public JAXBElement<CmisExtensionType> createCreateFolderExtension(CmisExtensionType value) {
/* 2138 */     return new JAXBElement<>(_GetRepositoriesExtension_QNAME, CmisExtensionType.class, CreateFolder.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "extension", scope = CreateFolderResponse.class)
/*      */   public JAXBElement<CmisExtensionType> createCreateFolderResponseExtension(CmisExtensionType value) {
/* 2147 */     return new JAXBElement<>(_GetRepositoriesExtension_QNAME, CmisExtensionType.class, CreateFolderResponse.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "addACEs", scope = CreateRelationship.class)
/*      */   public JAXBElement<CmisAccessControlListType> createCreateRelationshipAddACEs(CmisAccessControlListType value) {
/* 2156 */     return new JAXBElement<>(_CreateDocumentAddACEs_QNAME, CmisAccessControlListType.class, CreateRelationship.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "removeACEs", scope = CreateRelationship.class)
/*      */   public JAXBElement<CmisAccessControlListType> createCreateRelationshipRemoveACEs(CmisAccessControlListType value) {
/* 2165 */     return new JAXBElement<>(_CreateDocumentRemoveACEs_QNAME, CmisAccessControlListType.class, CreateRelationship.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "extension", scope = CreateRelationship.class)
/*      */   public JAXBElement<CmisExtensionType> createCreateRelationshipExtension(CmisExtensionType value) {
/* 2174 */     return new JAXBElement<>(_GetRepositoriesExtension_QNAME, CmisExtensionType.class, CreateRelationship.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "extension", scope = CreateRelationshipResponse.class)
/*      */   public JAXBElement<CmisExtensionType> createCreateRelationshipResponseExtension(CmisExtensionType value) {
/* 2183 */     return new JAXBElement<>(_GetRepositoriesExtension_QNAME, CmisExtensionType.class, CreateRelationshipResponse.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "folderId", scope = CreatePolicy.class)
/*      */   public JAXBElement<String> createCreatePolicyFolderId(String value) {
/* 2192 */     return new JAXBElement<>(_GetCheckedOutDocsFolderId_QNAME, String.class, CreatePolicy.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "addACEs", scope = CreatePolicy.class)
/*      */   public JAXBElement<CmisAccessControlListType> createCreatePolicyAddACEs(CmisAccessControlListType value) {
/* 2201 */     return new JAXBElement<>(_CreateDocumentAddACEs_QNAME, CmisAccessControlListType.class, CreatePolicy.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "removeACEs", scope = CreatePolicy.class)
/*      */   public JAXBElement<CmisAccessControlListType> createCreatePolicyRemoveACEs(CmisAccessControlListType value) {
/* 2210 */     return new JAXBElement<>(_CreateDocumentRemoveACEs_QNAME, CmisAccessControlListType.class, CreatePolicy.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "extension", scope = CreatePolicy.class)
/*      */   public JAXBElement<CmisExtensionType> createCreatePolicyExtension(CmisExtensionType value) {
/* 2219 */     return new JAXBElement<>(_GetRepositoriesExtension_QNAME, CmisExtensionType.class, CreatePolicy.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "extension", scope = CreatePolicyResponse.class)
/*      */   public JAXBElement<CmisExtensionType> createCreatePolicyResponseExtension(CmisExtensionType value) {
/* 2228 */     return new JAXBElement<>(_GetRepositoriesExtension_QNAME, CmisExtensionType.class, CreatePolicyResponse.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "folderId", scope = CreateItem.class)
/*      */   public JAXBElement<String> createCreateItemFolderId(String value) {
/* 2237 */     return new JAXBElement<>(_GetCheckedOutDocsFolderId_QNAME, String.class, CreateItem.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "addACEs", scope = CreateItem.class)
/*      */   public JAXBElement<CmisAccessControlListType> createCreateItemAddACEs(CmisAccessControlListType value) {
/* 2246 */     return new JAXBElement<>(_CreateDocumentAddACEs_QNAME, CmisAccessControlListType.class, CreateItem.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "removeACEs", scope = CreateItem.class)
/*      */   public JAXBElement<CmisAccessControlListType> createCreateItemRemoveACEs(CmisAccessControlListType value) {
/* 2255 */     return new JAXBElement<>(_CreateDocumentRemoveACEs_QNAME, CmisAccessControlListType.class, CreateItem.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "extension", scope = CreateItem.class)
/*      */   public JAXBElement<CmisExtensionType> createCreateItemExtension(CmisExtensionType value) {
/* 2264 */     return new JAXBElement<>(_GetRepositoriesExtension_QNAME, CmisExtensionType.class, CreateItem.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "extension", scope = CreateItemResponse.class)
/*      */   public JAXBElement<CmisExtensionType> createCreateItemResponseExtension(CmisExtensionType value) {
/* 2273 */     return new JAXBElement<>(_GetRepositoriesExtension_QNAME, CmisExtensionType.class, CreateItemResponse.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "extension", scope = GetAllowableActions.class)
/*      */   public JAXBElement<CmisExtensionType> createGetAllowableActionsExtension(CmisExtensionType value) {
/* 2282 */     return new JAXBElement<>(_GetRepositoriesExtension_QNAME, CmisExtensionType.class, GetAllowableActions.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "filter", scope = GetProperties.class)
/*      */   public JAXBElement<String> createGetPropertiesFilter(String value) {
/* 2291 */     return new JAXBElement<>(_GetDescendantsFilter_QNAME, String.class, GetProperties.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "extension", scope = GetProperties.class)
/*      */   public JAXBElement<CmisExtensionType> createGetPropertiesExtension(CmisExtensionType value) {
/* 2300 */     return new JAXBElement<>(_GetRepositoriesExtension_QNAME, CmisExtensionType.class, GetProperties.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "filter", scope = GetObject.class)
/*      */   public JAXBElement<String> createGetObjectFilter(String value) {
/* 2309 */     return new JAXBElement<>(_GetDescendantsFilter_QNAME, String.class, GetObject.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "includeAllowableActions", scope = GetObject.class)
/*      */   public JAXBElement<Boolean> createGetObjectIncludeAllowableActions(Boolean value) {
/* 2318 */     return new JAXBElement<>(_GetDescendantsIncludeAllowableActions_QNAME, Boolean.class, GetObject.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "includeRelationships", scope = GetObject.class)
/*      */   public JAXBElement<EnumIncludeRelationships> createGetObjectIncludeRelationships(EnumIncludeRelationships value) {
/* 2327 */     return new JAXBElement<>(_GetDescendantsIncludeRelationships_QNAME, EnumIncludeRelationships.class, GetObject.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "renditionFilter", scope = GetObject.class)
/*      */   public JAXBElement<String> createGetObjectRenditionFilter(String value) {
/* 2336 */     return new JAXBElement<>(_GetDescendantsRenditionFilter_QNAME, String.class, GetObject.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "includePolicyIds", scope = GetObject.class)
/*      */   public JAXBElement<Boolean> createGetObjectIncludePolicyIds(Boolean value) {
/* 2345 */     return new JAXBElement<>(_GetObjectIncludePolicyIds_QNAME, Boolean.class, GetObject.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "includeACL", scope = GetObject.class)
/*      */   public JAXBElement<Boolean> createGetObjectIncludeACL(Boolean value) {
/* 2354 */     return new JAXBElement<>(_GetObjectIncludeACL_QNAME, Boolean.class, GetObject.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "extension", scope = GetObject.class)
/*      */   public JAXBElement<CmisExtensionType> createGetObjectExtension(CmisExtensionType value) {
/* 2363 */     return new JAXBElement<>(_GetRepositoriesExtension_QNAME, CmisExtensionType.class, GetObject.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "filter", scope = GetObjectByPath.class)
/*      */   public JAXBElement<String> createGetObjectByPathFilter(String value) {
/* 2372 */     return new JAXBElement<>(_GetDescendantsFilter_QNAME, String.class, GetObjectByPath.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "includeAllowableActions", scope = GetObjectByPath.class)
/*      */   public JAXBElement<Boolean> createGetObjectByPathIncludeAllowableActions(Boolean value) {
/* 2381 */     return new JAXBElement<>(_GetDescendantsIncludeAllowableActions_QNAME, Boolean.class, GetObjectByPath.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "includeRelationships", scope = GetObjectByPath.class)
/*      */   public JAXBElement<EnumIncludeRelationships> createGetObjectByPathIncludeRelationships(EnumIncludeRelationships value) {
/* 2390 */     return new JAXBElement<>(_GetDescendantsIncludeRelationships_QNAME, EnumIncludeRelationships.class, GetObjectByPath.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "renditionFilter", scope = GetObjectByPath.class)
/*      */   public JAXBElement<String> createGetObjectByPathRenditionFilter(String value) {
/* 2399 */     return new JAXBElement<>(_GetDescendantsRenditionFilter_QNAME, String.class, GetObjectByPath.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "includePolicyIds", scope = GetObjectByPath.class)
/*      */   public JAXBElement<Boolean> createGetObjectByPathIncludePolicyIds(Boolean value) {
/* 2408 */     return new JAXBElement<>(_GetObjectIncludePolicyIds_QNAME, Boolean.class, GetObjectByPath.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "includeACL", scope = GetObjectByPath.class)
/*      */   public JAXBElement<Boolean> createGetObjectByPathIncludeACL(Boolean value) {
/* 2417 */     return new JAXBElement<>(_GetObjectIncludeACL_QNAME, Boolean.class, GetObjectByPath.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "extension", scope = GetObjectByPath.class)
/*      */   public JAXBElement<CmisExtensionType> createGetObjectByPathExtension(CmisExtensionType value) {
/* 2426 */     return new JAXBElement<>(_GetRepositoriesExtension_QNAME, CmisExtensionType.class, GetObjectByPath.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "streamId", scope = GetContentStream.class)
/*      */   public JAXBElement<String> createGetContentStreamStreamId(String value) {
/* 2435 */     return new JAXBElement<>(_GetContentStreamStreamId_QNAME, String.class, GetContentStream.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "offset", scope = GetContentStream.class)
/*      */   public JAXBElement<BigInteger> createGetContentStreamOffset(BigInteger value) {
/* 2444 */     return new JAXBElement<>(_GetContentStreamOffset_QNAME, BigInteger.class, GetContentStream.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "length", scope = GetContentStream.class)
/*      */   public JAXBElement<BigInteger> createGetContentStreamLength(BigInteger value) {
/* 2453 */     return new JAXBElement<>(_GetContentStreamLength_QNAME, BigInteger.class, GetContentStream.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "extension", scope = GetContentStream.class)
/*      */   public JAXBElement<CmisExtensionType> createGetContentStreamExtension(CmisExtensionType value) {
/* 2462 */     return new JAXBElement<>(_GetRepositoriesExtension_QNAME, CmisExtensionType.class, GetContentStream.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "changeToken", scope = UpdateProperties.class)
/*      */   public JAXBElement<String> createUpdatePropertiesChangeToken(String value) {
/* 2471 */     return new JAXBElement<>(_UpdatePropertiesChangeToken_QNAME, String.class, UpdateProperties.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "extension", scope = UpdateProperties.class)
/*      */   public JAXBElement<CmisExtensionType> createUpdatePropertiesExtension(CmisExtensionType value) {
/* 2480 */     return new JAXBElement<>(_GetRepositoriesExtension_QNAME, CmisExtensionType.class, UpdateProperties.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "extension", scope = UpdatePropertiesResponse.class)
/*      */   public JAXBElement<CmisExtensionType> createUpdatePropertiesResponseExtension(CmisExtensionType value) {
/* 2489 */     return new JAXBElement<>(_GetRepositoriesExtension_QNAME, CmisExtensionType.class, UpdatePropertiesResponse.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "extension", scope = BulkUpdateProperties.class)
/*      */   public JAXBElement<CmisExtensionType> createBulkUpdatePropertiesExtension(CmisExtensionType value) {
/* 2498 */     return new JAXBElement<>(_GetRepositoriesExtension_QNAME, CmisExtensionType.class, BulkUpdateProperties.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "extension", scope = BulkUpdatePropertiesResponse.class)
/*      */   public JAXBElement<CmisExtensionType> createBulkUpdatePropertiesResponseExtension(CmisExtensionType value) {
/* 2507 */     return new JAXBElement<>(_GetRepositoriesExtension_QNAME, CmisExtensionType.class, BulkUpdatePropertiesResponse.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "extension", scope = MoveObject.class)
/*      */   public JAXBElement<CmisExtensionType> createMoveObjectExtension(CmisExtensionType value) {
/* 2516 */     return new JAXBElement<>(_GetRepositoriesExtension_QNAME, CmisExtensionType.class, MoveObject.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "extension", scope = MoveObjectResponse.class)
/*      */   public JAXBElement<CmisExtensionType> createMoveObjectResponseExtension(CmisExtensionType value) {
/* 2525 */     return new JAXBElement<>(_GetRepositoriesExtension_QNAME, CmisExtensionType.class, MoveObjectResponse.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "allVersions", scope = DeleteObject.class)
/*      */   public JAXBElement<Boolean> createDeleteObjectAllVersions(Boolean value) {
/* 2534 */     return new JAXBElement<>(_DeleteObjectAllVersions_QNAME, Boolean.class, DeleteObject.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "extension", scope = DeleteObject.class)
/*      */   public JAXBElement<CmisExtensionType> createDeleteObjectExtension(CmisExtensionType value) {
/* 2543 */     return new JAXBElement<>(_GetRepositoriesExtension_QNAME, CmisExtensionType.class, DeleteObject.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "extension", scope = DeleteObjectResponse.class)
/*      */   public JAXBElement<CmisExtensionType> createDeleteObjectResponseExtension(CmisExtensionType value) {
/* 2552 */     return new JAXBElement<>(_GetRepositoriesExtension_QNAME, CmisExtensionType.class, DeleteObjectResponse.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "allVersions", scope = DeleteTree.class)
/*      */   public JAXBElement<Boolean> createDeleteTreeAllVersions(Boolean value) {
/* 2561 */     return new JAXBElement<>(_DeleteObjectAllVersions_QNAME, Boolean.class, DeleteTree.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "unfileObjects", scope = DeleteTree.class)
/*      */   public JAXBElement<EnumUnfileObject> createDeleteTreeUnfileObjects(EnumUnfileObject value) {
/* 2570 */     return new JAXBElement<>(_DeleteTreeUnfileObjects_QNAME, EnumUnfileObject.class, DeleteTree.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "continueOnFailure", scope = DeleteTree.class)
/*      */   public JAXBElement<Boolean> createDeleteTreeContinueOnFailure(Boolean value) {
/* 2579 */     return new JAXBElement<>(_DeleteTreeContinueOnFailure_QNAME, Boolean.class, DeleteTree.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "extension", scope = DeleteTree.class)
/*      */   public JAXBElement<CmisExtensionType> createDeleteTreeExtension(CmisExtensionType value) {
/* 2588 */     return new JAXBElement<>(_GetRepositoriesExtension_QNAME, CmisExtensionType.class, DeleteTree.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "overwriteFlag", scope = SetContentStream.class)
/*      */   public JAXBElement<Boolean> createSetContentStreamOverwriteFlag(Boolean value) {
/* 2597 */     return new JAXBElement<>(_SetContentStreamOverwriteFlag_QNAME, Boolean.class, SetContentStream.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "changeToken", scope = SetContentStream.class)
/*      */   public JAXBElement<String> createSetContentStreamChangeToken(String value) {
/* 2606 */     return new JAXBElement<>(_UpdatePropertiesChangeToken_QNAME, String.class, SetContentStream.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "extension", scope = SetContentStream.class)
/*      */   public JAXBElement<CmisExtensionType> createSetContentStreamExtension(CmisExtensionType value) {
/* 2615 */     return new JAXBElement<>(_GetRepositoriesExtension_QNAME, CmisExtensionType.class, SetContentStream.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "extension", scope = SetContentStreamResponse.class)
/*      */   public JAXBElement<CmisExtensionType> createSetContentStreamResponseExtension(CmisExtensionType value) {
/* 2624 */     return new JAXBElement<>(_GetRepositoriesExtension_QNAME, CmisExtensionType.class, SetContentStreamResponse.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "isLastChunk", scope = AppendContentStream.class)
/*      */   public JAXBElement<Boolean> createAppendContentStreamIsLastChunk(Boolean value) {
/* 2633 */     return new JAXBElement<>(_AppendContentStreamIsLastChunk_QNAME, Boolean.class, AppendContentStream.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "changeToken", scope = AppendContentStream.class)
/*      */   public JAXBElement<String> createAppendContentStreamChangeToken(String value) {
/* 2642 */     return new JAXBElement<>(_UpdatePropertiesChangeToken_QNAME, String.class, AppendContentStream.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "extension", scope = AppendContentStream.class)
/*      */   public JAXBElement<CmisExtensionType> createAppendContentStreamExtension(CmisExtensionType value) {
/* 2651 */     return new JAXBElement<>(_GetRepositoriesExtension_QNAME, CmisExtensionType.class, AppendContentStream.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "extension", scope = AppendContentStreamResponse.class)
/*      */   public JAXBElement<CmisExtensionType> createAppendContentStreamResponseExtension(CmisExtensionType value) {
/* 2660 */     return new JAXBElement<>(_GetRepositoriesExtension_QNAME, CmisExtensionType.class, AppendContentStreamResponse.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "extension", scope = DeleteContentStream.class)
/*      */   public JAXBElement<CmisExtensionType> createDeleteContentStreamExtension(CmisExtensionType value) {
/* 2669 */     return new JAXBElement<>(_GetRepositoriesExtension_QNAME, CmisExtensionType.class, DeleteContentStream.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "extension", scope = DeleteContentStreamResponse.class)
/*      */   public JAXBElement<CmisExtensionType> createDeleteContentStreamResponseExtension(CmisExtensionType value) {
/* 2678 */     return new JAXBElement<>(_GetRepositoriesExtension_QNAME, CmisExtensionType.class, DeleteContentStreamResponse.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "extension", scope = AddObjectToFolder.class)
/*      */   public JAXBElement<CmisExtensionType> createAddObjectToFolderExtension(CmisExtensionType value) {
/* 2687 */     return new JAXBElement<>(_GetRepositoriesExtension_QNAME, CmisExtensionType.class, AddObjectToFolder.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "extension", scope = AddObjectToFolderResponse.class)
/*      */   public JAXBElement<CmisExtensionType> createAddObjectToFolderResponseExtension(CmisExtensionType value) {
/* 2696 */     return new JAXBElement<>(_GetRepositoriesExtension_QNAME, CmisExtensionType.class, AddObjectToFolderResponse.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "folderId", scope = RemoveObjectFromFolder.class)
/*      */   public JAXBElement<String> createRemoveObjectFromFolderFolderId(String value) {
/* 2705 */     return new JAXBElement<>(_GetCheckedOutDocsFolderId_QNAME, String.class, RemoveObjectFromFolder.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "extension", scope = RemoveObjectFromFolder.class)
/*      */   public JAXBElement<CmisExtensionType> createRemoveObjectFromFolderExtension(CmisExtensionType value) {
/* 2714 */     return new JAXBElement<>(_GetRepositoriesExtension_QNAME, CmisExtensionType.class, RemoveObjectFromFolder.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "extension", scope = RemoveObjectFromFolderResponse.class)
/*      */   public JAXBElement<CmisExtensionType> createRemoveObjectFromFolderResponseExtension(CmisExtensionType value) {
/* 2723 */     return new JAXBElement<>(_GetRepositoriesExtension_QNAME, CmisExtensionType.class, RemoveObjectFromFolderResponse.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "searchAllVersions", scope = Query.class)
/*      */   public JAXBElement<Boolean> createQuerySearchAllVersions(Boolean value) {
/* 2732 */     return new JAXBElement<>(_QuerySearchAllVersions_QNAME, Boolean.class, Query.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "includeAllowableActions", scope = Query.class)
/*      */   public JAXBElement<Boolean> createQueryIncludeAllowableActions(Boolean value) {
/* 2741 */     return new JAXBElement<>(_GetDescendantsIncludeAllowableActions_QNAME, Boolean.class, Query.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "includeRelationships", scope = Query.class)
/*      */   public JAXBElement<EnumIncludeRelationships> createQueryIncludeRelationships(EnumIncludeRelationships value) {
/* 2750 */     return new JAXBElement<>(_GetDescendantsIncludeRelationships_QNAME, EnumIncludeRelationships.class, Query.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "renditionFilter", scope = Query.class)
/*      */   public JAXBElement<String> createQueryRenditionFilter(String value) {
/* 2759 */     return new JAXBElement<>(_GetDescendantsRenditionFilter_QNAME, String.class, Query.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "maxItems", scope = Query.class)
/*      */   public JAXBElement<BigInteger> createQueryMaxItems(BigInteger value) {
/* 2768 */     return new JAXBElement<>(_GetTypeChildrenMaxItems_QNAME, BigInteger.class, Query.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "skipCount", scope = Query.class)
/*      */   public JAXBElement<BigInteger> createQuerySkipCount(BigInteger value) {
/* 2777 */     return new JAXBElement<>(_GetTypeChildrenSkipCount_QNAME, BigInteger.class, Query.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "extension", scope = Query.class)
/*      */   public JAXBElement<CmisExtensionType> createQueryExtension(CmisExtensionType value) {
/* 2786 */     return new JAXBElement<>(_GetRepositoriesExtension_QNAME, CmisExtensionType.class, Query.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "changeLogToken", scope = GetContentChanges.class)
/*      */   public JAXBElement<String> createGetContentChangesChangeLogToken(String value) {
/* 2795 */     return new JAXBElement<>(_GetContentChangesChangeLogToken_QNAME, String.class, GetContentChanges.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "includeProperties", scope = GetContentChanges.class)
/*      */   public JAXBElement<Boolean> createGetContentChangesIncludeProperties(Boolean value) {
/* 2804 */     return new JAXBElement<>(_GetContentChangesIncludeProperties_QNAME, Boolean.class, GetContentChanges.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "filter", scope = GetContentChanges.class)
/*      */   public JAXBElement<String> createGetContentChangesFilter(String value) {
/* 2813 */     return new JAXBElement<>(_GetDescendantsFilter_QNAME, String.class, GetContentChanges.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "includePolicyIds", scope = GetContentChanges.class)
/*      */   public JAXBElement<Boolean> createGetContentChangesIncludePolicyIds(Boolean value) {
/* 2822 */     return new JAXBElement<>(_GetObjectIncludePolicyIds_QNAME, Boolean.class, GetContentChanges.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "includeACL", scope = GetContentChanges.class)
/*      */   public JAXBElement<Boolean> createGetContentChangesIncludeACL(Boolean value) {
/* 2831 */     return new JAXBElement<>(_GetObjectIncludeACL_QNAME, Boolean.class, GetContentChanges.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "maxItems", scope = GetContentChanges.class)
/*      */   public JAXBElement<BigInteger> createGetContentChangesMaxItems(BigInteger value) {
/* 2840 */     return new JAXBElement<>(_GetTypeChildrenMaxItems_QNAME, BigInteger.class, GetContentChanges.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "extension", scope = GetContentChanges.class)
/*      */   public JAXBElement<CmisExtensionType> createGetContentChangesExtension(CmisExtensionType value) {
/* 2849 */     return new JAXBElement<>(_GetRepositoriesExtension_QNAME, CmisExtensionType.class, GetContentChanges.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "extension", scope = CheckOut.class)
/*      */   public JAXBElement<CmisExtensionType> createCheckOutExtension(CmisExtensionType value) {
/* 2858 */     return new JAXBElement<>(_GetRepositoriesExtension_QNAME, CmisExtensionType.class, CheckOut.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "extension", scope = CheckOutResponse.class)
/*      */   public JAXBElement<CmisExtensionType> createCheckOutResponseExtension(CmisExtensionType value) {
/* 2867 */     return new JAXBElement<>(_GetRepositoriesExtension_QNAME, CmisExtensionType.class, CheckOutResponse.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "extension", scope = CancelCheckOut.class)
/*      */   public JAXBElement<CmisExtensionType> createCancelCheckOutExtension(CmisExtensionType value) {
/* 2876 */     return new JAXBElement<>(_GetRepositoriesExtension_QNAME, CmisExtensionType.class, CancelCheckOut.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "extension", scope = CancelCheckOutResponse.class)
/*      */   public JAXBElement<CmisExtensionType> createCancelCheckOutResponseExtension(CmisExtensionType value) {
/* 2885 */     return new JAXBElement<>(_GetRepositoriesExtension_QNAME, CmisExtensionType.class, CancelCheckOutResponse.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "major", scope = CheckIn.class)
/*      */   public JAXBElement<Boolean> createCheckInMajor(Boolean value) {
/* 2894 */     return new JAXBElement<>(_CheckInMajor_QNAME, Boolean.class, CheckIn.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "properties", scope = CheckIn.class)
/*      */   public JAXBElement<CmisPropertiesType> createCheckInProperties(CmisPropertiesType value) {
/* 2903 */     return new JAXBElement<>(_CheckInProperties_QNAME, CmisPropertiesType.class, CheckIn.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "contentStream", scope = CheckIn.class)
/*      */   public JAXBElement<CmisContentStreamType> createCheckInContentStream(CmisContentStreamType value) {
/* 2912 */     return new JAXBElement<>(_CreateDocumentContentStream_QNAME, CmisContentStreamType.class, CheckIn.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "checkinComment", scope = CheckIn.class)
/*      */   public JAXBElement<String> createCheckInCheckinComment(String value) {
/* 2921 */     return new JAXBElement<>(_CheckInCheckinComment_QNAME, String.class, CheckIn.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "addACEs", scope = CheckIn.class)
/*      */   public JAXBElement<CmisAccessControlListType> createCheckInAddACEs(CmisAccessControlListType value) {
/* 2930 */     return new JAXBElement<>(_CreateDocumentAddACEs_QNAME, CmisAccessControlListType.class, CheckIn.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "removeACEs", scope = CheckIn.class)
/*      */   public JAXBElement<CmisAccessControlListType> createCheckInRemoveACEs(CmisAccessControlListType value) {
/* 2939 */     return new JAXBElement<>(_CreateDocumentRemoveACEs_QNAME, CmisAccessControlListType.class, CheckIn.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "extension", scope = CheckIn.class)
/*      */   public JAXBElement<CmisExtensionType> createCheckInExtension(CmisExtensionType value) {
/* 2948 */     return new JAXBElement<>(_GetRepositoriesExtension_QNAME, CmisExtensionType.class, CheckIn.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "extension", scope = CheckInResponse.class)
/*      */   public JAXBElement<CmisExtensionType> createCheckInResponseExtension(CmisExtensionType value) {
/* 2957 */     return new JAXBElement<>(_GetRepositoriesExtension_QNAME, CmisExtensionType.class, CheckInResponse.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "filter", scope = GetPropertiesOfLatestVersion.class)
/*      */   public JAXBElement<String> createGetPropertiesOfLatestVersionFilter(String value) {
/* 2966 */     return new JAXBElement<>(_GetDescendantsFilter_QNAME, String.class, GetPropertiesOfLatestVersion.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "extension", scope = GetPropertiesOfLatestVersion.class)
/*      */   public JAXBElement<CmisExtensionType> createGetPropertiesOfLatestVersionExtension(CmisExtensionType value) {
/* 2975 */     return new JAXBElement<>(_GetRepositoriesExtension_QNAME, CmisExtensionType.class, GetPropertiesOfLatestVersion.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "filter", scope = GetObjectOfLatestVersion.class)
/*      */   public JAXBElement<String> createGetObjectOfLatestVersionFilter(String value) {
/* 2984 */     return new JAXBElement<>(_GetDescendantsFilter_QNAME, String.class, GetObjectOfLatestVersion.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "includeAllowableActions", scope = GetObjectOfLatestVersion.class)
/*      */   public JAXBElement<Boolean> createGetObjectOfLatestVersionIncludeAllowableActions(Boolean value) {
/* 2993 */     return new JAXBElement<>(_GetDescendantsIncludeAllowableActions_QNAME, Boolean.class, GetObjectOfLatestVersion.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "includeRelationships", scope = GetObjectOfLatestVersion.class)
/*      */   public JAXBElement<EnumIncludeRelationships> createGetObjectOfLatestVersionIncludeRelationships(EnumIncludeRelationships value) {
/* 3002 */     return new JAXBElement<>(_GetDescendantsIncludeRelationships_QNAME, EnumIncludeRelationships.class, GetObjectOfLatestVersion.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "renditionFilter", scope = GetObjectOfLatestVersion.class)
/*      */   public JAXBElement<String> createGetObjectOfLatestVersionRenditionFilter(String value) {
/* 3011 */     return new JAXBElement<>(_GetDescendantsRenditionFilter_QNAME, String.class, GetObjectOfLatestVersion.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "includePolicyIds", scope = GetObjectOfLatestVersion.class)
/*      */   public JAXBElement<Boolean> createGetObjectOfLatestVersionIncludePolicyIds(Boolean value) {
/* 3020 */     return new JAXBElement<>(_GetObjectIncludePolicyIds_QNAME, Boolean.class, GetObjectOfLatestVersion.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "includeACL", scope = GetObjectOfLatestVersion.class)
/*      */   public JAXBElement<Boolean> createGetObjectOfLatestVersionIncludeACL(Boolean value) {
/* 3029 */     return new JAXBElement<>(_GetObjectIncludeACL_QNAME, Boolean.class, GetObjectOfLatestVersion.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "extension", scope = GetObjectOfLatestVersion.class)
/*      */   public JAXBElement<CmisExtensionType> createGetObjectOfLatestVersionExtension(CmisExtensionType value) {
/* 3038 */     return new JAXBElement<>(_GetRepositoriesExtension_QNAME, CmisExtensionType.class, GetObjectOfLatestVersion.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "filter", scope = GetAllVersions.class)
/*      */   public JAXBElement<String> createGetAllVersionsFilter(String value) {
/* 3047 */     return new JAXBElement<>(_GetDescendantsFilter_QNAME, String.class, GetAllVersions.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "includeAllowableActions", scope = GetAllVersions.class)
/*      */   public JAXBElement<Boolean> createGetAllVersionsIncludeAllowableActions(Boolean value) {
/* 3056 */     return new JAXBElement<>(_GetDescendantsIncludeAllowableActions_QNAME, Boolean.class, GetAllVersions.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "extension", scope = GetAllVersions.class)
/*      */   public JAXBElement<CmisExtensionType> createGetAllVersionsExtension(CmisExtensionType value) {
/* 3065 */     return new JAXBElement<>(_GetRepositoriesExtension_QNAME, CmisExtensionType.class, GetAllVersions.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "relationshipDirection", scope = GetObjectRelationships.class)
/*      */   public JAXBElement<EnumRelationshipDirection> createGetObjectRelationshipsRelationshipDirection(EnumRelationshipDirection value) {
/* 3074 */     return new JAXBElement<>(_GetObjectRelationshipsRelationshipDirection_QNAME, EnumRelationshipDirection.class, GetObjectRelationships.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "typeId", scope = GetObjectRelationships.class)
/*      */   public JAXBElement<String> createGetObjectRelationshipsTypeId(String value) {
/* 3083 */     return new JAXBElement<>(_GetTypeChildrenTypeId_QNAME, String.class, GetObjectRelationships.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "filter", scope = GetObjectRelationships.class)
/*      */   public JAXBElement<String> createGetObjectRelationshipsFilter(String value) {
/* 3092 */     return new JAXBElement<>(_GetDescendantsFilter_QNAME, String.class, GetObjectRelationships.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "includeAllowableActions", scope = GetObjectRelationships.class)
/*      */   public JAXBElement<Boolean> createGetObjectRelationshipsIncludeAllowableActions(Boolean value) {
/* 3101 */     return new JAXBElement<>(_GetDescendantsIncludeAllowableActions_QNAME, Boolean.class, GetObjectRelationships.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "maxItems", scope = GetObjectRelationships.class)
/*      */   public JAXBElement<BigInteger> createGetObjectRelationshipsMaxItems(BigInteger value) {
/* 3110 */     return new JAXBElement<>(_GetTypeChildrenMaxItems_QNAME, BigInteger.class, GetObjectRelationships.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "skipCount", scope = GetObjectRelationships.class)
/*      */   public JAXBElement<BigInteger> createGetObjectRelationshipsSkipCount(BigInteger value) {
/* 3119 */     return new JAXBElement<>(_GetTypeChildrenSkipCount_QNAME, BigInteger.class, GetObjectRelationships.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "extension", scope = GetObjectRelationships.class)
/*      */   public JAXBElement<CmisExtensionType> createGetObjectRelationshipsExtension(CmisExtensionType value) {
/* 3128 */     return new JAXBElement<>(_GetRepositoriesExtension_QNAME, CmisExtensionType.class, GetObjectRelationships.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "extension", scope = ApplyPolicy.class)
/*      */   public JAXBElement<CmisExtensionType> createApplyPolicyExtension(CmisExtensionType value) {
/* 3137 */     return new JAXBElement<>(_GetRepositoriesExtension_QNAME, CmisExtensionType.class, ApplyPolicy.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "extension", scope = ApplyPolicyResponse.class)
/*      */   public JAXBElement<CmisExtensionType> createApplyPolicyResponseExtension(CmisExtensionType value) {
/* 3146 */     return new JAXBElement<>(_GetRepositoriesExtension_QNAME, CmisExtensionType.class, ApplyPolicyResponse.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "extension", scope = RemovePolicy.class)
/*      */   public JAXBElement<CmisExtensionType> createRemovePolicyExtension(CmisExtensionType value) {
/* 3155 */     return new JAXBElement<>(_GetRepositoriesExtension_QNAME, CmisExtensionType.class, RemovePolicy.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "extension", scope = RemovePolicyResponse.class)
/*      */   public JAXBElement<CmisExtensionType> createRemovePolicyResponseExtension(CmisExtensionType value) {
/* 3164 */     return new JAXBElement<>(_GetRepositoriesExtension_QNAME, CmisExtensionType.class, RemovePolicyResponse.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "filter", scope = GetAppliedPolicies.class)
/*      */   public JAXBElement<String> createGetAppliedPoliciesFilter(String value) {
/* 3173 */     return new JAXBElement<>(_GetDescendantsFilter_QNAME, String.class, GetAppliedPolicies.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "extension", scope = GetAppliedPolicies.class)
/*      */   public JAXBElement<CmisExtensionType> createGetAppliedPoliciesExtension(CmisExtensionType value) {
/* 3182 */     return new JAXBElement<>(_GetRepositoriesExtension_QNAME, CmisExtensionType.class, GetAppliedPolicies.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "onlyBasicPermissions", scope = GetACL.class)
/*      */   public JAXBElement<Boolean> createGetACLOnlyBasicPermissions(Boolean value) {
/* 3191 */     return new JAXBElement<>(_GetACLOnlyBasicPermissions_QNAME, Boolean.class, GetACL.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "extension", scope = GetACL.class)
/*      */   public JAXBElement<CmisExtensionType> createGetACLExtension(CmisExtensionType value) {
/* 3200 */     return new JAXBElement<>(_GetRepositoriesExtension_QNAME, CmisExtensionType.class, GetACL.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "ACLPropagation", scope = ApplyACL.class)
/*      */   public JAXBElement<EnumACLPropagation> createApplyACLACLPropagation(EnumACLPropagation value) {
/* 3209 */     return new JAXBElement<>(_ApplyACLACLPropagation_QNAME, EnumACLPropagation.class, ApplyACL.class, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", name = "extension", scope = ApplyACL.class)
/*      */   public JAXBElement<CmisExtensionType> createApplyACLExtension(CmisExtensionType value) {
/* 3218 */     return new JAXBElement<>(_GetRepositoriesExtension_QNAME, CmisExtensionType.class, ApplyACL.class, value);
/*      */   }
/*      */ }


/* Location:              E:\web\java_work\jd-gui-windows-1.6.6\chemistry-opencmis-commons-impl-1.1.0.jar!\org\apache\chemistry\opencmis\commons\impl\jaxb\ObjectFactory.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */