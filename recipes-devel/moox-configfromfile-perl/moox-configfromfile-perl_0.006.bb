DESCRIPTION = "This module is intended to easy load initialization values for \
attributes on object construction from an appropriate config file. The \
building is done in \
MooX::ConfigFromFile::Role - using MooX::ConfigFromFile ensures the \
role is \
applied."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/MooX-ConfigFromFile"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RE/REHSACK/MooX-ConfigFromFile-0.006.tar.gz"

SRC_URI[md5sum] = "62c34c408fbf63728aa9e569c2d388cb"
SRC_URI[sha256sum] = "8ab3b95910ae5fce6895c9d5edc30978c63ae6d1f344736f86e153a66c3564e5"
RDEPENDS_${PN} += "config-any-perl"
RDEPENDS_${PN} += "file-find-rule-perl"
RDEPENDS_${PN} += "moo-perl"
RDEPENDS_${PN} += "moox-file-configdir-perl"
DEPENDS += "json-perl-native"

S = "${WORKDIR}/MooX-ConfigFromFile-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
