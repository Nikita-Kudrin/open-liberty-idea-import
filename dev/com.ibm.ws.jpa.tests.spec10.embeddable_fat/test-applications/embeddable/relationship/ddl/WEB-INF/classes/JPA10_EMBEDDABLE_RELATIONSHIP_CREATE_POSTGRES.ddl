CREATE TABLE AnnBiM2MInv (id INTEGER NOT NULL, PRIMARY KEY (id));
CREATE TABLE AnnBiM2MOwnEm (BIM2MINVERSE INTEGER, BIM2MOWNER INTEGER);
CREATE TABLE AnnBiM2OOwn (id INTEGER NOT NULL, BIM2OOWNER INTEGER, PRIMARY KEY (id));
CREATE TABLE AnnBiO2MInv (id INTEGER NOT NULL, PRIMARY KEY (id));
CREATE TABLE AnnBiO2OInv (id INTEGER NOT NULL, PRIMARY KEY (id));
CREATE TABLE AnnBiO2OInvAO (id INTEGER NOT NULL, PRIMARY KEY (id));
CREATE TABLE AnnBiO2OOwn (id INTEGER NOT NULL, BIO2OOWNER INTEGER, PRIMARY KEY (id));
CREATE TABLE AnnRootEmRL (id INTEGER NOT NULL, BIO2OINVERSE INTEGER, BIM2OINVERSE INTEGER, BIO2OINVERSEASSOCOVERRIDE INTEGER, UNIM2OINVERSE INTEGER, UNIO2ODUMMYFA INTEGER, UNIO2ODUMMYPA INTEGER, PRIMARY KEY (id));
CREATE TABLE AnnUniO2O (id INTEGER NOT NULL, PRIMARY KEY (id));
CREATE TABLE colUniO2OOwnPAEmOC (parent_id INTEGER, UNIO2ODUMMYPA INTEGER, valueOrderColumn INTEGER);
CREATE TABLE listUniO2OOwnFAEmAOOC (parent_id INTEGER, UNIO2OINVERSEASSOCOVERRIDE INTEGER, valueOrderColumn INTEGER);
CREATE TABLE listUniO2OOwnFAEmOC (parent_id INTEGER, UNIO2ODUMMYFA INTEGER, valueOrderColumn INTEGER);
CREATE TABLE mapKeyIntValUniO2OOwnFAEmOC (parent_id INTEGER, mykey INTEGER NOT NULL, value INTEGER);
CREATE TABLE mapKeyUniO2OEmValUniO2OEmOC (parent_id INTEGER, mykey INTEGER, value INTEGER);
CREATE TABLE setUniO2OOwnFAEmOC (parent_id INTEGER, UNIO2ODUMMYFA INTEGER, valueOrderColumn INTEGER);
CREATE INDEX I_NNBMWNM_BIM2MINVERSE ON AnnBiM2MOwnEm (BIM2MINVERSE);
CREATE INDEX I_NNBMWNM_ELEMENT ON AnnBiM2MOwnEm (BIM2MOWNER);
CREATE INDEX I_NNBM2WN_INVERSE ON AnnBiM2OOwn (BIM2OOWNER);
CREATE INDEX I_NNB2OWN_INVERSE ON AnnBiO2OOwn (BIO2OOWNER);
CREATE INDEX I_NNRTMRL_BIO2MINVERSEENTITY ON AnnRootEmRL (BIM2OINVERSE);
CREATE INDEX I_NNRTMRL_BIO2OINVERSEASSOCIATIONOVERRIDESENTITY ON AnnRootEmRL (BIO2OINVERSEASSOCOVERRIDE);
CREATE INDEX I_NNRTMRL_BIO2OINVERSEENTITY ON AnnRootEmRL (BIO2OINVERSE);
CREATE INDEX I_NNRTMRL_UNIO2MDUMMYENTITY ON AnnRootEmRL (UNIM2OINVERSE);
CREATE INDEX I_NNRTMRL_UNIO2ODUMMYENTITY_FA ON AnnRootEmRL (UNIO2ODUMMYFA);
CREATE INDEX I_NNRTMRL_UNIO2ODUMMYENTITY_PA ON AnnRootEmRL (UNIO2ODUMMYPA);
CREATE INDEX I_CLN2PMC_PARENT_ID ON colUniO2OOwnPAEmOC (parent_id);
CREATE INDEX I_CLN2PMC_UNIO2ODUMMYENTITY_PA ON colUniO2OOwnPAEmOC (UNIO2ODUMMYPA);
CREATE INDEX I_LSTNFMC_PARENT_ID ON listUniO2OOwnFAEmAOOC (parent_id);
CREATE INDEX I_LSTNFMC_UNIO2ODUMMYENTITY_FA ON listUniO2OOwnFAEmAOOC (UNIO2OINVERSEASSOCOVERRIDE);
CREATE INDEX I_LSTNFMC_PARENT_ID1 ON listUniO2OOwnFAEmOC (parent_id);
CREATE INDEX I_LSTNFMC_UNIO2ODUMMYENTITY_FA1 ON listUniO2OOwnFAEmOC (UNIO2ODUMMYFA);
CREATE INDEX I_MPKYFMC_PARENT_ID ON mapKeyIntValUniO2OOwnFAEmOC (parent_id);
CREATE INDEX I_MPKYFMC_UNIO2ODUMMYENTITY_FA ON mapKeyIntValUniO2OOwnFAEmOC (value);
CREATE INDEX I_MPKY2MC_PARENT_ID ON mapKeyUniO2OEmValUniO2OEmOC (parent_id);
CREATE INDEX I_MPKY2MC_UNIO2ODUMMYENTITY_FA ON mapKeyUniO2OEmValUniO2OEmOC (mykey);
CREATE INDEX I_MPKY2MC_UNIO2ODUMMYENTITY_FA1 ON mapKeyUniO2OEmValUniO2OEmOC (value);
CREATE INDEX I_STN2FMC_PARENT_ID ON setUniO2OOwnFAEmOC (parent_id);
CREATE INDEX I_STN2FMC_UNIO2ODUMMYENTITY_FA ON setUniO2OOwnFAEmOC (UNIO2ODUMMYFA);
CREATE TABLE XMLBiM2MInv (id INTEGER NOT NULL, PRIMARY KEY (id));
CREATE TABLE XMLBiM2MOwnEm (BIM2MINVERSE INTEGER, BIM2MOWNER INTEGER);
CREATE TABLE XMLBiM2OOwn (id INTEGER NOT NULL, BIM2OOWNER INTEGER, PRIMARY KEY (id));
CREATE TABLE XMLBiO2MInv (id INTEGER NOT NULL, PRIMARY KEY (id));
CREATE TABLE XMLBiO2OInv (id INTEGER NOT NULL, PRIMARY KEY (id));
CREATE TABLE XMLBiO2OInvAO (id INTEGER NOT NULL, PRIMARY KEY (id));
CREATE TABLE XMLBiO2OOwn (id INTEGER NOT NULL, BIO2OOWNER INTEGER, PRIMARY KEY (id));
CREATE TABLE XMLRootEmRL (id INTEGER NOT NULL, BIM2OINVERSE INTEGER, BIO2OINVERSEASSOCOVERRIDE INTEGER, BIO2OINVERSE INTEGER, UNIM2OINVERSE INTEGER, UNIO2ODUMMYFA INTEGER, UNIO2ODUMMYPA INTEGER, PRIMARY KEY (id));
CREATE TABLE XMLUniO2O (id INTEGER NOT NULL, PRIMARY KEY (id));
CREATE INDEX I_XMLBWNM_BIM2MINVERSE ON XMLBiM2MOwnEm (BIM2MINVERSE);
CREATE INDEX I_XMLBWNM_ELEMENT ON XMLBiM2MOwnEm (BIM2MOWNER);
CREATE INDEX I_XMLB2WN_INVERSE1 ON XMLBiM2OOwn (BIM2OOWNER);
CREATE INDEX I_XMLB2WN_INVERSE ON XMLBiO2OOwn (BIO2OOWNER);
CREATE INDEX I_XMLRMRL_BIO2MINVERSEENTITY ON XMLRootEmRL (BIM2OINVERSE);
CREATE INDEX I_XMLRMRL_BIO2OINVERSEASSOCIATIONOVERRIDESENTITY ON XMLRootEmRL (BIO2OINVERSEASSOCOVERRIDE);
CREATE INDEX I_XMLRMRL_BIO2OINVERSEENTITY ON XMLRootEmRL (BIO2OINVERSE);
CREATE INDEX I_XMLRMRL_UNIO2MDUMMYENTITY ON XMLRootEmRL (UNIM2OINVERSE);
CREATE INDEX I_XMLRMRL_UNIO2ODUMMYENTITY_FA ON XMLRootEmRL (UNIO2ODUMMYFA);
CREATE INDEX I_XMLRMRL_UNIO2ODUMMYENTITY_PA ON XMLRootEmRL (UNIO2ODUMMYPA);