DESCRIPTION = "This module is intended to easy load initialization values for attributes \
on object construction from an appropriate config file. The building is \
done in MooX::ConfigFromFile::Role - using MooX::ConfigFromFile ensures the \
role is applied."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/MooX-ConfigFromFile"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RE/REHSACK/MooX-ConfigFromFile-0.009.tar.gz"

SRC_URI[md5sum] = "e326c60319105394ab6a98a0d6066710"
SRC_URI[sha256sum] = "12fbfd7659d15992c5994d88e66622c1dc0abce903fc9531f9db59449f4d393d"
RDEPENDS:${PN} += "config-any-perl"
RDEPENDS:${PN} += "file-find-rule-perl"
RDEPENDS:${PN} += "moo-perl"
RDEPENDS:${PN} += "moox-file-configdir-perl"
DEPENDS += "hash-merge-perl-native"
DEPENDS += "json-perl-native"

S = "${WORKDIR}/MooX-ConfigFromFile-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
