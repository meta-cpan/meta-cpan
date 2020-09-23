DESCRIPTION = "POSIX::strftime::Compiler provides GNU C library compatible strftime(3). \
But this module will not affected by the system locale. This feature is \
useful when you want to write loggers, servers and portable applications."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/POSIX-strftime-Compiler"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/K/KA/KAZEBURO/POSIX-strftime-Compiler-0.44.tar.gz"

SRC_URI[md5sum] = "3a5ae7d56a5917410c1b661e01ed1a68"
SRC_URI[sha256sum] = "dfd3c97398dcfe51c8236b85e3dc28035667b76531f7aa0a6535f3aa5405b35a"
DEPENDS += "module-build-tiny-perl-native"

S = "${WORKDIR}/POSIX-strftime-Compiler-${PV}"

inherit cpan_build allarch

BBCLASSEXTEND = "native"
