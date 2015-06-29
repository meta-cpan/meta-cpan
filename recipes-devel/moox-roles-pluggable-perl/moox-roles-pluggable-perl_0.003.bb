DESCRIPTION = "This module allows a class consuming several roles based on rules \
passed to Module::Pluggable::Object."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/MooX-Roles-Pluggable"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/R/RE/REHSACK/MooX-Roles-Pluggable-0.003.tar.gz"

SRC_URI[md5sum] = "89ea43a260efc5cc50b03c30fa1f586b"
SRC_URI[sha256sum] = "f7a907b7ed91ff68aa9cfe4c57385658a8af6110c516f3a11d5ee9fe7b5bbc3e"
RDEPENDS_${PN} += "module-pluggable-perl"
RDEPENDS_${PN} += "moo-perl"
DEPENDS += "module-build-perl-native"

S = "${WORKDIR}/MooX-Roles-Pluggable-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
