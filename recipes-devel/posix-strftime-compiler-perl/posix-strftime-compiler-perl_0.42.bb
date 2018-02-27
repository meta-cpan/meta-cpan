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

SRC_URI = "https://cpan.metacpan.org/authors/id/K/KA/KAZEBURO/POSIX-strftime-Compiler-0.42.tar.gz"

SRC_URI[md5sum] = "c0a5f76b1b0ce9cdb90d627b017e6cf5"
SRC_URI[sha256sum] = "26582bdd78b254bcc1c56d0b770fa280e8b8f70957c84dc44572ba4cacb0ac11"
DEPENDS += "module-build-perl-native"

S = "${WORKDIR}/POSIX-strftime-Compiler-${PV}"

inherit cpan_build allarch

BBCLASSEXTEND = "native"
