package folder_practice.business;

import br.gov.frameworkdemoiselle.stereotype.BusinessController;
import br.gov.frameworkdemoiselle.template.DelegateCrud;
import folder_practice.domain.Category;
import folder_practice.persistence.CategoryDAO;

@BusinessController
public class CategoryBC extends DelegateCrud<Category, Long, CategoryDAO> {

	private static final long serialVersionUID = 1L;

}
