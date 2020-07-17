package org.miguelramos.recipeapplication.service;

import org.miguelramos.recipeapplication.commands.UnitOfMeasureCommand;

import java.util.Set;

public interface UnitOfMeasureService {

    Set<UnitOfMeasureCommand> listAllUoms();
}
