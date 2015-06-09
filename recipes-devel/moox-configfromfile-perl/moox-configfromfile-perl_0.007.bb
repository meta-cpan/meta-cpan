DESCRIPTION = "This module is intended to easy load initialization values for \
attributes on object construction from an appropriate config file. The \
building is done in MooX::ConfigFromFile::Role - using MooX::ConfigFromFile \
ensures the role is applied."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/MooX-ConfigFromFile"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RE/REHSACK/MooX-ConfigFromFile-0.007.tar.gz"

SRC_URI[md5sum] = "5afdbfcbe77c51a979507d341cf691c3"
SRC_URI[sha256sum] = "15b39bd01e4d33acd0e8ef65938b8c077993fc60ebb73638d7f1419b19dd0163"
RDEPENDS_${PN} += "config-any-perl"
RDEPENDS_${PN} += "file-find-rule-perl"
RDEPENDS_${PN} += "moo-perl"
RDEPENDS_${PN} += "moox-file-configdir-perl"
RRECOMMENDS_${PN} += "hash-merge-perl"
DEPENDS += "hash-merge-perl-native"
DEPENDS += "json-perl-native"

S = "${WORKDIR}/MooX-ConfigFromFile-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
