DESCRIPTION = ""Path::Class" is a module for manipulation of file and directory \
specifications (strings describing their locations, like \
'/home/ken/foo.txt' or 'C:\\Windows\\Foo.txt') in a cross-platform manner. \
It supports pretty much every platform Perl runs on, including Unix, \
Windows, Mac, VMS, Epoc, Cygwin, OS/2, and NetWare."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Path-Class"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/K/KW/KWILLIAMS/Path-Class-0.36.tar.gz"

SRC_URI[md5sum] = "3e15307faf0702fb916409f594552b94"
SRC_URI[sha256sum] = "45e6f51329a31b3f52810eec70f2ff54e3faea8893f07bdf95028adb71dcbdf9"
DEPENDS += "module-build-perl-native"

S = "${WORKDIR}/Path-Class-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
