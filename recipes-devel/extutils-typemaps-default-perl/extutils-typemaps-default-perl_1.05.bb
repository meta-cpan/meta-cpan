DESCRIPTION = "This module had to be renamed. Use ExtUtils::Typemaps::Default instead!"

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/ExtUtils-Typemaps-Default"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/S/SM/SMUELLER/ExtUtils-Typemaps-Default-1.05.tar.gz"

SRC_URI[md5sum] = "346c127faf7b74bc4cfc29fa3e8e6f8d"
SRC_URI[sha256sum] = "3dfaf5837ebfdc007895bfca84c3c2e76d589a7d336400e8dfb3243d818215de"
DEPENDS += "module-build-perl-native"

S = "${WORKDIR}/ExtUtils-Typemaps-Default-${PV}"

inherit cpan_build allarch

BBCLASSEXTEND = "native"
