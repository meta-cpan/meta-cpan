DESCRIPTION = "This module allows a class consuming several roles based on rules passed to \
Module::Pluggable::Object."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/MooX-Roles-Pluggable"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RE/REHSACK/MooX-Roles-Pluggable-0.003.tar.gz"

SRC_URI[md5sum] = "89ea43a260efc5cc50b03c30fa1f586b"
SRC_URI[sha256sum] = "f7a907b7ed91ff68aa9cfe4c57385658a8af6110c516f3a11d5ee9fe7b5bbc3e"
RDEPENDS:${PN} += "module-pluggable-perl"
RDEPENDS:${PN} += "moo-perl"

S = "${WORKDIR}/MooX-Roles-Pluggable-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
