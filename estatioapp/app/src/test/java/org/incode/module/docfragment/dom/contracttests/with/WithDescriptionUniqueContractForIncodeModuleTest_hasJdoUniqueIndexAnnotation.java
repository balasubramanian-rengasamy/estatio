package org.incode.module.docfragment.dom.contracttests.with;

import org.incode.module.base.dom.with.WithDescriptionUnique;
import org.incode.module.base.dom.with.WithFieldUniqueContractTestAllAbstract;

public class WithDescriptionUniqueContractForIncodeModuleTest_hasJdoUniqueIndexAnnotation extends
        WithFieldUniqueContractTestAllAbstract<WithDescriptionUnique> {

    public WithDescriptionUniqueContractForIncodeModuleTest_hasJdoUniqueIndexAnnotation() {
        super("org.incode.module.docfragment", "description", WithDescriptionUnique.class);
    }

}
