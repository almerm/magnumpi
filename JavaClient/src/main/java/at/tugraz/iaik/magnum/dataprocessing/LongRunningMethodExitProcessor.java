/*******************************************************************************
 * Copyright 2013 Alexander Jesner, Bernd Prünster
 * Copyright 2013, 2014 Bernd Prünster
 *
 *     This file is part of Magnum PI.
 *
 *     Magnum PI is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     Magnum PI is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with Magnum PI.  If not, see <http://www.gnu.org/licenses/>.
 *******************************************************************************/
package at.tugraz.iaik.magnum.dataprocessing;

import at.tugraz.iaik.magnum.data.transport.MethodExitTransportObject;
import at.tugraz.iaik.magnum.data.transport.TransportObject;
import at.tugraz.iaik.magnum.model.IModelBuilder;
import at.tugraz.iaik.magnum.model.MethodInvocationModel;
import at.tugraz.iaik.magnum.model.ModelObject;

public class LongRunningMethodExitProcessor extends Processor {

  private boolean updatedInvocationModel;
  private MethodInvocationModel invocationModel;
  
  public LongRunningMethodExitProcessor(TransportObject obj, IModelBuilder builder, IExecutorManager executorManager) {
    super(executorManager);
    
    MethodExitTransportObject exit = (MethodExitTransportObject) obj;
    builder.processDeferredInvocationExitMessage(exit);
  }

  @Override
  public ModelObject callInternal() throws Exception {
    return updatedInvocationModel ? invocationModel : ModelObject.empty;
  }

}