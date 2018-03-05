DESCRIPTION = "Magic is Perl's way of enhancing variables. This mechanism lets the user \
add extra data to any variable and hook syntactical operations (such as \
access, assignment or destruction) that can be applied to it. With this \
module, you can add your own magic to any variable without having to write \
a single line of XS."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Variable-Magic"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/V/VP/VPIT/Variable-Magic-0.62.tar.gz"

SRC_URI[md5sum] = "588d94ec3d98dece878a776d161c1dda"
SRC_URI[sha256sum] = "3f9a18517e33f006a9c2fc4f43f01b54abfe6ff2eae7322424f31069296b615c"

S = "${WORKDIR}/Variable-Magic-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
