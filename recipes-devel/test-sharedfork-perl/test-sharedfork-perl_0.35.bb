DESCRIPTION = "Test::SharedFork is utility module for Test::Builder."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test-SharedFork"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/E/EX/EXODIST/Test-SharedFork-0.35.tar.gz"

SRC_URI[md5sum] = "3101aea2e3ae41d48fd8874414430cef"
SRC_URI[sha256sum] = "2932e865610e80758f764c586757ef8e11db1284d958e25e4b7a85098414c59f"
DEPENDS += "test-requires-perl-native"

S = "${WORKDIR}/Test-SharedFork-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
