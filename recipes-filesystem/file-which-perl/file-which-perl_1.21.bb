DESCRIPTION = "File::Which finds the full or relative paths to executable programs on the \
system. This is normally the function of "which" utility. "which" is \
typically implemented as either a program or a built in shell command. On \
some platforms, such as Microsoft Windows it is not provided as part of the \
core operating system. This module provides a consistent API to this \
functionality regardless of the underlying platform."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/File-Which"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PL/PLICEASE/File-Which-1.21.tar.gz"

SRC_URI[md5sum] = "115a6efe5d7e9621237fcb655c7a0980"
SRC_URI[sha256sum] = "9def5f10316bfd944e56b7f8a2501be1d44c288325309462aa9345e340854bcc"

S = "${WORKDIR}/File-Which-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
