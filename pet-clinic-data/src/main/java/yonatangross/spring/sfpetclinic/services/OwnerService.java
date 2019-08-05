package yonatangross.spring.sfpetclinic.services;

import yonatangross.spring.sfpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner,Long>{

    Owner findByLastName(String lastName);


}
