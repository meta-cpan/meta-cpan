DESCRIPTION = ""Path::Class\" is a module for manipulation of file and directory \
specifications (strings describing their locations, like \
'/home/ken/foo.txt' \
or 'C:\\Windows\\Foo.txt') in a cross-platform manner. It supports \
pretty much \
every platform Perl runs on, including Unix, Windows, Mac, VMS, Epoc, \
Cygwin, OS/2, and NetWare."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Path-Class"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/K/KW/KWILLIAMS/Path-Class-0.35.tar.gz"

SRC_URI[md5sum] = "575b60a5c5e22e259c1df62a59fdfe85"
SRC_URI[sha256sum] = "9226b305196127d02529303dbd6c37802baafe736f0245cb089241ed25922aee"
DEPENDS += "perl"

S = "${WORKDIR}/Path-Class-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
