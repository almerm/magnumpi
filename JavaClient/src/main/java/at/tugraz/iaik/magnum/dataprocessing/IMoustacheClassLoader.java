/*******************************************************************************
 * Copyright 2013 Alexander Jesner, Bernd PrÃ¼nster
 * Copyright 2013, 2014 Bernd PrÃ¼nster
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

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.jar.JarFile;

import at.tugraz.iaik.magnum.model.ApkModel;

public interface IMoustacheClassLoader {

  public abstract void initializeForApk(ApkModel apk) throws IOException;

  public abstract void waitForInitialization() throws InterruptedException;

  public abstract Set<JarFile> getJarFiles();
  
  public void ApkFileImport(File apkFile) throws IOException;

}