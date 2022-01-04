package folder_practice.persistence;

import br.gov.frameworkdemoiselle.stereotype.PersistenceController;
import br.gov.frameworkdemoiselle.template.JPACrud;
import folder_practice.domain.Category;

@PersistenceController
public class CategoryDAO extends JPACrud<Category, Long> {

	private static final long serialVersionUID = 1L;

}
