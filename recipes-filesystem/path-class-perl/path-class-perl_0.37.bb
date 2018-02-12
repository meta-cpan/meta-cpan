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

SRC_URI = "https://cpan.metacpan.org/authors/id/K/KW/KWILLIAMS/Path-Class-0.37.tar.gz"

SRC_URI[md5sum] = "13e6db714f6d5a0e62ca1c4a7fc4d0f3"
SRC_URI[sha256sum] = "654781948602386f2cb2e4473a739f17dc6953d92aabc2498a4ca2561bc248ce"

S = "${WORKDIR}/Path-Class-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
