/******************************************************************************
 * Product: Adempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2006 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software; you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY; without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program; if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
package org.compiere.apps;

import java.util.ListResourceBundle;

/**
 *  Base Resource Bundle.
 *  If you translate it, make sure that you convert the file to ASCII via
 *  native2ascii 
 *  http://java.sun.com/j2se/1.5.0/docs/tooldocs/windows/native2ascii.html
 *  The non ASCII characters need to be converted to unicode - e.g. \u00ab
 *  This makes it less readable in the source, but viewable for everyone
 *
 * 	@author 	Jorg Janke
 * 	@version 	$Id: ALoginRes.java,v 1.2 2006/07/30 00:51:27 jjanke Exp $
 */
public final class ALoginRes_hu extends ListResourceBundle
{
	/** Translation Content     */
	static final Object[][] contents = new String[][]
	{
	{ "Connection",         "Kapcsolat" },
	{ "Defaults",           "Alap??rtelmez??s" },
	{ "Login",              "ADempiere Bel??p??s" },
	{ "File",               "F??jl" },
	{ "Exit",               "Kil??p??s" },
	{ "Help",               "S??g??" },
	{ "About",              "N??vjegy" },
	{ "Host",               "Szerver" },
	{ "Database",           "Adatb??zis" },
	{ "User",               "Felhaszn??l?? ID" },
	{ "EnterUser",          "??rja be a felhaszn??l?? ID-t" },
	{ "Password",           "Jelsz??" },
	{ "EnterPassword",      "??rja be a jelszav??t" },
	{ "Language",           "Nyelv" },
	{ "SelectLanguage",     "V??lasszon nyelvet" },
	{ "Role",               "Szerepk??r" },
	{ "Client",             "V??llalat" },
	{ "Organization",       "Szervezet" },
	{ "Date",               "D??tum" },
	{ "Warehouse",          "Rakt??r" },
	{ "Printer",            "Nyomtat??" },
	{ "Connected",          "Csatlakoztatva" },
	{ "NotConnected",       "Nincs csatlakoztatva" },
	{ "DatabaseNotFound",   "Az adatb??zis nem tal??lhat??" },
	{ "UserPwdError",       "A felhaszn??l?? vagy jelsz?? hib??s" },
	{ "RoleNotFound",       "A szerepk??r nem tal??lhat??" },
	{ "Authorized",         "Jogosults??g ellen??rizve" },
	{ "Ok",                 "Ok" },
	{ "Cancel",             "M??gsem" },
	{ "VersionConflict",    "Verzi?? ??tk??z??s:" },
	{ "VersionInfo",        "Szerver <> Kliens" },
	{ "PleaseUpgrade",      "T??ltse le a program ??j verzi??j??t a szerverr??l" }
	};

	/**
	 *  Get Contents
	 *  @return context
	 */
	public Object[][] getContents()
	{
		return contents;
	}   //  getContents
}   //  ALoginRes
