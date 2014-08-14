DESCRIPTION = "Hash::MultiValue is an object (and a plain hash reference) that may \
contain multiple values per key, inspired by MultiDict of WebOb."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Hash-MultiValue"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/M/MI/MIYAGAWA/Hash-MultiValue-0.15.tar.gz"

SRC_URI[md5sum] = "eb7df1402b774b07a305dbb67873817a"
SRC_URI[sha256sum] = "805d0eba514f18d9af60f7d8baf50b5b6e004bbaa12da43642d40575f93c83c9"

S = "${WORKDIR}/Hash-MultiValue-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
