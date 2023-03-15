DESCRIPTION = "POSIX::strftime::Compiler provides GNU C library compatible strftime(3). \
But this module will not affected by the system locale. This feature is \
useful when you want to write loggers, servers and portable applications."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/POSIX-strftime-Compiler"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/K/KA/KAZEBURO/POSIX-strftime-Compiler-0.44.tar.gz"

SRC_URI[md5sum] = "3a5ae7d56a5917410c1b661e01ed1a68"
SRC_URI[sha256sum] = "dfd3c97398dcfe51c8236b85e3dc28035667b76531f7aa0a6535f3aa5405b35a"
DEPENDS += "module-build-tiny-perl-native"

S = "${WORKDIR}/POSIX-strftime-Compiler-${PV}"

inherit cpan_build allarch

BBCLASSEXTEND = "native"
