DESCRIPTION = "Given a list of Perl modules/filenames, this module makes "require" and \
"use" statements fail (no matter the specified files/modules are installed \
or not)."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Devel-Hide"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/F/FE/FERREIRA/Devel-Hide-0.0010.tar.gz"

SRC_URI[md5sum] = "0f62b47eb7c73732b3f50470a4937dbd"
SRC_URI[sha256sum] = "756fefa60febf1d8dbc851426bfb084520db45f745d35c8e8623945d6dda5e82"

S = "${WORKDIR}/Devel-Hide-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
