DESCRIPTION = "This module allows a class consuming several roles based on rules \
passed to Module::Pluggable::Object."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/MooX-Roles-Pluggable"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/R/RE/REHSACK/MooX-Roles-Pluggable-0.002.tar.gz"

SRC_URI[md5sum] = "e7efa32bdeff1e25c5b9dba5631fb960"
SRC_URI[sha256sum] = "ae04041a544d2551826e243ebe9899aea8a1738ad34c0cd13f041c606a04ccd3"
RDEPENDS_${PN} += "module-pluggable-perl"
RDEPENDS_${PN} += "moo-perl"
DEPENDS += "module-build-perl-native"

S = "${WORKDIR}/MooX-Roles-Pluggable-${PV}"

inherit cpan_build

BBCLASSEXTEND = "native"
